import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Girilen Sayı : ");
        int input = scan.nextInt();

        Arrays.sort(list);
        
        int minClosest = Integer.MIN_VALUE;
        int maxClosest = Integer.MAX_VALUE;

        for (int i : list) {
            if (i < input) {
                minClosest = i;
            }
            if (i > input) {
                maxClosest = i;
                break;
            }
        }

        System.out.println("Dizi: " + Arrays.toString(list));
        System.out.println("Girilen Sayı : " + input);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + minClosest);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + maxClosest);
    }
}
