import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int n = scan.nextInt();
        
        if (n <= 0) {
            System.out.println("Geçerli bir boyut giriniz.");
            return;
        }

        int[] list = new int[n];
        System.out.println("Dizinin elemanlarını giriniz : ");
        
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı : ");
            list[i] = scan.nextInt();
        }

        Arrays.sort(list);
        
        System.out.print("Sıralama : ");
        for (int item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
