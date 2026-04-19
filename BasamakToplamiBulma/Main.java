import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = input.nextInt();
        
        int tempNumber = number;
        int sum = 0;
        
        while (tempNumber != 0) {
            sum += tempNumber % 10;
            tempNumber /= 10;
        }
        
        System.out.println(number + " sayısının basamakları toplamı: " + sum);
    }
}
