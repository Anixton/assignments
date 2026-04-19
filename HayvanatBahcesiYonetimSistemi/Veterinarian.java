public class Veterinarian {
    public void giveMedicine(Animal animal) {
        double dosage = animal.getDosage();
        System.out.println(animal.getTurAdi() + " türüne " + dosage + " mg ilaç verildi. (Yemek saati: " + animal.getFeedSchedule() + ")");
    }
}
