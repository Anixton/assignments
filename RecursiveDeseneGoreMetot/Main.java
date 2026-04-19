import java.util.Scanner;

public class Main {
    static void pattern(int n, int temp, boolean isDecreasing) {
        System.out.print(temp + " ");
        
        if (temp <= 0) {
            isDecreasing = false;
        }
        
        if (!isDecreasing && temp == n) {
            return;
        }
        
        if (isDecreasing) {
            pattern(n, temp - 5, isDecreasing);
        } else {
            pattern(n, temp + 5, isDecreasing);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int n = input.nextInt();
        
        System.out.print("Çıktısı : ");
        pattern(n, n, true);
        System.out.println();
    }
}
