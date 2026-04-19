import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();
        
        if (n <= 0) {
            System.out.println("Geçerli bir sayı giriniz.");
            return;
        }
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int temp = input.nextInt();
            
            if (temp > max) {
                max = temp;
            }
            if (temp < min) {
                min = temp;
            }
        }
        
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
