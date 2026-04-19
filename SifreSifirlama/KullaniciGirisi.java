import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Sisteme kayıtlı varsayılan şifre (Kullanıcının unuttuğu şifre)
        String kayitliSifre = "java123";

        System.out.print("Lütfen şifrenizi giriniz: ");
        String girilenSifre = input.nextLine();

        if (girilenSifre.equals(kayitliSifre)) {
            System.out.println("Giriş Başarılı!");
        } else {
            System.out.println("Hatalı şifre girdiniz!");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (Evet için 'e', Hayır için 'h' tuşlayınız): ");
            String secim = input.nextLine();

            if (secim.equalsIgnoreCase("e")) {
                System.out.print("Lütfen yeni şifrenizi giriniz: ");
                String yeniSifre = input.nextLine();

                // Yeni şifrenin hem unuttuğu (eski) şifreyle hem de az önce yanlış girdiği şifreyle aynı olup olmadığını kontrol ediyoruz
                if (yeniSifre.equals(kayitliSifre) || yeniSifre.equals(girilenSifre)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            } else if (secim.equalsIgnoreCase("h")) {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            } else {
                System.out.println("Geçersiz bir seçim yaptınız.");
            }
        }

        input.close();
    }
}
