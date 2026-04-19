import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        double num1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı giriniz: ");
        double num2 = scanner.nextDouble();

        System.out.println("İşlem seçiniz: ");
        System.out.println("1 - Toplama");
        System.out.println("2 - Çıkarma");
        System.out.println("3 - Çarpma");
        System.out.println("4 - Bölme");
        System.out.print("Seçiminiz: ");
        int choice = scanner.nextInt();

        // Switch-case yapısı ile hesap makinesi mantığı
        switch (choice) {
            case 1:
                System.out.println("Sonuç: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Sonuç: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Sonuç: " + (num1 * num2));
                break;
            case 4:
                // Sıfıra bölünme kontrolü
                if (num2 != 0) {
                    System.out.println("Sonuç: " + (num1 / num2));
                } else {
                    System.out.println("Hata: Bir sayı 0'a bölünemez!");
                }
                break;
            default:
                System.out.println("Hatalı seçim yaptınız! Lütfen 1 ile 4 arasında bir değer giriniz.");
                break;
        }

        scanner.close();
    }
}
