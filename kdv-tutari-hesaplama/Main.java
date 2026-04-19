import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lütfen para değerini giriniz: ");
        double miktar = scanner.nextDouble();
        
        double kdvOrani = (miktar > 0 && miktar <= 1000) ? 0.18 : 0.08;
        double kdvTutari = miktar * kdvOrani;
        double kdvliFiyat = miktar + kdvTutari;
        
        System.out.println("KDV'siz Fiyat = " + miktar);
        System.out.println("KDV'li Fiyat = " + kdvliFiyat);
        System.out.println("KDV tutarı = " + kdvTutari);
        
        scanner.close();
    }
}
