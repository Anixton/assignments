import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. sayıyı (a) giriniz: ");
        int a = scanner.nextInt();

        System.out.print("2. sayıyı (b) giriniz: ");
        int b = scanner.nextInt();

        System.out.print("3. sayıyı (c) giriniz: ");
        int c = scanner.nextInt();

        // 3 sayının iç içe if koşulları ile küçükten büyüğe sıralanması
        if (a <= b && a <= c) {
            // Eğer a en küçük ise, sadece b ve c'yi kendi aralarında kıyaslıyoruz
            if (b <= c) {
                System.out.println("Sıralama: a <= b <= c (" + a + " <= " + b + " <= " + c + ")");
            } else {
                System.out.println("Sıralama: a <= c <= b (" + a + " <= " + c + " <= " + b + ")");
            }
        } else if (b <= a && b <= c) {
            // Eğer b en küçük ise, a ve c'yi kendi aralarında kıyaslıyoruz
            if (a <= c) {
                System.out.println("Sıralama: b <= a <= c (" + b + " <= " + a + " <= " + c + ")");
            } else {
                System.out.println("Sıralama: b <= c <= a (" + b + " <= " + c + " <= " + a + ")");
            }
        } else {
            // b ve a en küçük değilse, c en küçüktür. Geriye a ve b'nin kıyaslanması kalır.
            if (a <= b) {
                System.out.println("Sıralama: c <= a <= b (" + c + " <= " + a + " <= " + b + ")");
            } else {
                System.out.println("Sıralama: c <= b <= a (" + c + " <= " + b + " <= " + a + ")");
            }
        }

        scanner.close();
    }
}
