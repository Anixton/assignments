import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Dik üçgende hipotenüs bulma
        System.out.println("--- Dik Üçgende Hipotenüs Hesaplama ---");
        System.out.print("1. Dik kenarı giriniz: ");
        double a = input.nextDouble();

        System.out.print("2. Dik kenarı giriniz: ");
        double b = input.nextDouble();

        double hipotenus = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüs: " + hipotenus);

        // 2. Üçgenin alanını bulma (Ödev)
        System.out.println("\n--- Üçgenin Alanını Hesaplama ---");
        System.out.print("1. Kenar uzunluğunu giriniz: ");
        double kenar1 = input.nextDouble();

        System.out.print("2. Kenar uzunluğunu giriniz: ");
        double kenar2 = input.nextDouble();

        System.out.print("3. Kenar uzunluğunu giriniz: ");
        double kenar3 = input.nextDouble();

        double u = (kenar1 + kenar2 + kenar3) / 2;
        double alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));

        System.out.println("Üçgenin Çevresi: " + (2 * u));
        System.out.println("Üçgenin Alanı: " + alan);

        input.close();
    }
}
