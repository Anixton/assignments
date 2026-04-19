import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        int n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        int n2 = input.nextInt();
        
        int ebob = 1;
        int ekok = 1;
        
        int i = 1;
        while (i <= n1 && i <= n2) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        
        System.out.println("EBOB: " + ebob);
        
        ekok = (n1 * n2) / ebob;
        System.out.println("EKOK: " + ekok);
    }
}
