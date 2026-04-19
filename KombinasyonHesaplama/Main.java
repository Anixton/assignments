import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Kümenin eleman sayısı (n): ");
        int n = input.nextInt();
        
        System.out.print("Grupların eleman sayısı (r): ");
        int r = input.nextInt();
        
        if (n >= r && n >= 0 && r >= 0) {
            long nFact = 1;
            for (int i = 1; i <= n; i++) {
                nFact *= i;
            }
            
            long rFact = 1;
            for (int i = 1; i <= r; i++) {
                rFact *= i;
            }
            
            long nMinusRFact = 1;
            for (int i = 1; i <= (n - r); i++) {
                nMinusRFact *= i;
            }
            
            long combination = nFact / (rFact * nMinusRFact);
            System.out.println("C(" + n + "," + r + ") = " + combination);
        } else {
            System.out.println("Geçersiz giriş yaptınız. n >= r >= 0 olmalıdır.");
        }
    }
}
