import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matematik, fizik, kimya, turkce, tarih, muzik;

        System.out.print("Matematik notunuzu giriniz: ");
        matematik = scanner.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = scanner.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = scanner.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = scanner.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = scanner.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = scanner.nextInt();

        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6.0;
        
        System.out.println("Ortalamanız: " + ortalama);

        // Ternary operatörü kullanılarak geçme/kalma durumu belirleniyor
        String durum = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(durum);
    }
}
