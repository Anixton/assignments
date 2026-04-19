import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int startPrice = 10;
        double perKm = 2.20;
        double distance, total;

        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen mesafeyi (KM) giriniz: ");
        distance = input.nextDouble();

        total = startPrice + (distance * perKm);

        total = (total < 20) ? 20 : total;

        System.out.println("Taksimetre Tutarı: " + total + " TL");
    }
}
