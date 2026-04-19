import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String defaultUsername = "patika";
        String defaultPassword = "java123";
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Kullanıcı Adınız : ");
        String username = input.nextLine();
        
        System.out.print("Şifreniz : ");
        String password = input.nextLine();
        
        if (username.equals(defaultUsername) && password.equals(defaultPassword)) {
            System.out.println("Giriş yaptınız!");
        } else {
            System.out.println("Bilgileriniz Yanlış!");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (E/H) : ");
            String resetChoice = input.nextLine();
            
            if (resetChoice.equalsIgnoreCase("E")) {
                System.out.print("Yeni Şifrenizi Giriniz: ");
                String newPassword = input.nextLine();
                
                if (newPassword.equals(defaultPassword)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu");
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        }
        
        input.close();
    }
}
