import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan verilerin alınması
        System.out.print("Mesafeyi km türünden giriniz : ");
        int mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        int yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int yolculukTipi = input.nextInt();

        // Girdi Kontrolü (Mesafe ve Yaş pozitif olmalı, Yolculuk Tipi 1 veya 2 olmalı)
        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            
            // 1. Normal Tutarın Hesaplanması
            double normalTutar = mesafe * 0.10;
            double yasIndirimi = 0;

            // 2. Yaş İndiriminin Belirlenmesi
            if (yas < 12) {
                yasIndirimi = normalTutar * 0.50; // %50 indirim
            } else if (yas >= 12 && yas <= 24) {
                yasIndirimi = normalTutar * 0.10; // %10 indirim
            } else if (yas > 65) {
                yasIndirimi = normalTutar * 0.30; // %30 indirim
            }

            // İndirimli Tutar (Normal tutardan yaş indirimi çıkarılıyor)
            double indirimliTutar = normalTutar - yasIndirimi;
            double toplamTutar;

            // 3. Yolculuk Tipi İndiriminin Hesaplanması (Sadece gidiş-dönüş ise)
            if (yolculukTipi == 2) {
                double gidisDonusIndirimi = indirimliTutar * 0.20; // İndirimli tutar üzerinden %20 indirim
                toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2; // Gidiş ve dönüş olduğu için bilet * 2
            } else {
                toplamTutar = indirimliTutar; // Sadece tek yön
            }

            // Sonucun Yazdırılması
            System.out.println("Toplam Tutar = " + toplamTutar + " TL");

        } else {
            // Hatalı girilen durumlarda kullanıcıya verilecek uyarı
            System.out.println("Hatalı Veri Girdiniz !");
        }

        input.close();
    }
}
