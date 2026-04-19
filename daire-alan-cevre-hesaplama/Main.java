import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Dairenin yarıçapını (r) giriniz: ");
        double r = input.nextDouble();
        
        System.out.print("Merkez açısının ölçüsünü (𝛼) giriniz: ");
        double alpha = input.nextDouble();
        double pi = 3.14;
        
        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        double dilimAlani = (pi * (r * r) * alpha) / 360;
        
        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);
        System.out.println("Daire Diliminin Alanı: " + dilimAlani);
    }
}
