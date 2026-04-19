import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Taban değeri giriniz: ");
        int base = input.nextInt();
        
        System.out.print("Üs değerini giriniz: ");
        int exponent = input.nextInt();
        
        long total = 1;
        
        for (int i = 1; i <= exponent; i++) {
            total *= base;
        }
        
        System.out.println("Sonuç: " + total);
    }
}
