import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int total = 0;
        
        do {
            System.out.print("Sayı giriniz: ");
            n = input.nextInt();
            
            // 4'ün katları olan sayılar toplanıyor
            if (n % 4 == 0) {
                total += n;
            }
        } while (n % 2 == 0); // Tek sayı girilene kadar devem et
        
        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + total);
    }
}
