import java.util.Scanner;

public class EtkinlikOnerisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen sıcaklık değerini (C) giriniz: ");
        int heat = scanner.nextInt();

        System.out.println("\n--- 1. Çözüm Yolu (Else-If Zinciri ile) ---");
        // Değerler yukarı doğru kontrol edildiği için ekstra '&&' kullanmaya gerek kalmaz.
        if (heat < 5) {
            System.out.println("Öneri: Kayak yapmaya gidebilirsiniz.");
        } else if (heat < 15) {
            // Buraya düştüyse zaten 5'ten büyük veya 5'e eşittir.
            System.out.println("Öneri: Sinemaya gidebilirsiniz.");
        } else if (heat < 25) {
            // Buraya düştüyse zaten 15'ten büyük veya 15'e eşittir.
            System.out.println("Öneri: Pikniğe gidebilirsiniz.");
        } else {
            // 25 ve üzeri durumlarda çalışır.
            System.out.println("Öneri: Yüzmeye gidebilirsiniz.");
        }

        System.out.println("\n--- 2. Çözüm Yolu (Bağımsız İf'ler ve Mantıksal Operatörler ile) ---");
        // Her durum birbirinden bağımsız, sınırları tam çizilmiş 'if' bloklarıyla kontrol edilir.
        if (heat < 5) {
            System.out.println("Öneri: Kayak yapmaya gidebilirsiniz.");
        }
        if (heat >= 5 && heat < 15) {
            System.out.println("Öneri: Sinemaya gidebilirsiniz.");
        }
        if (heat >= 15 && heat < 25) {
            System.out.println("Öneri: Pikniğe gidebilirsiniz.");
        }
        if (heat >= 25) {
            System.out.println("Öneri: Yüzmeye gidebilirsiniz.");
        }

        System.out.println("\n--- 3. Çözüm Yolu (Ternary / Üçlü Operatör ile) ---");
        // Kısa kullanım olarak iç içe ternary yapısı da bir alternatiftir.
        String activity = (heat < 5) ? "Kayak yapmaya gidebilirsiniz." 
                        : (heat < 15) ? "Sinemaya gidebilirsiniz."
                        : (heat < 25) ? "Pikniğe gidebilirsiniz." 
                        : "Yüzmeye gidebilirsiniz.";
        System.out.println("Öneri: " + activity);

        scanner.close();
    }
}
