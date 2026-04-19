public class Main {
    public static void main(String[] args) {
        Animal at = new Horse("Zebra", 300, 5);
        Animal kaplan = new Feline("Kaplan", 180, 8);
        Animal kunduz = new Rodent("Kunduz", 15, 3);

        Veterinarian veteriner = new Veterinarian();

        System.out.println("--- Hayvanat Bahçesi İlaç ve Beslenme Takvimi ---");
        veteriner.giveMedicine(at);
        veteriner.giveMedicine(kaplan);
        veteriner.giveMedicine(kunduz);
    }
}
