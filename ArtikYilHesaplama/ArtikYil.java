import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        int yil = input.nextInt();

        boolean artikYilMi = false;

        // Artık yıl hesaplama mantığı
        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    artikYilMi = true; // 100'e bölünüyorsa ancak 400'e de bölünüyorsa artık yıldır
                } else {
                    artikYilMi = false; // 100'e tam bölünüp 400'e bölünemeyenler artık yıl değildir
                }
            } else {
                artikYilMi = true; // 4'e tam bölünüp 100'e bölünmeyenler artık yıldır
            }
        } else {
            artikYilMi = false; // 4'e bölünemeyenler artık yıl değildir
        }

        // Sonucu ekrana yazdır (Ödevdeki çıktı formatına uygun şekilde)
        if (artikYilMi) {
            System.out.println(yil + " bir artık yıldır !");
        } else {
            // Ödevdeki "bir artık yıldır değildir !" yazımına en uygun dil bilgisi düzeltmesi ile:
            System.out.println(yil + " bir artık yıl değildir !");
        }

        input.close();
    }
}
