import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int n = input.nextInt();
        
        int a = 0, b = 1;
        
        System.out.print(n + " Elemanlı Fibonacci Serisi : " + a + " " + b);
        
        for (int i = 2; i <= n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }
}
