public class Main {
    public static void main(String[] args) {
        int[] list = {3, 7, 3, 3, 2, 0, 9, 10, 21, 1, 33, 9, 0, 1, 2, 4, 4, 10, 8, 8};
        
        System.out.println("Tekrar Eden Çift Sayılar: ");
        boolean isDuplicate = false;
        
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j] && list[i] % 2 == 0) {
                    // Check if already printed
                    boolean alreadyPrinted = false;
                    for (int k = 0; k < i; k++) {
                        if (list[k] == list[i]) {
                            alreadyPrinted = true;
                            break;
                        }
                    }
                    if (!alreadyPrinted) {
                        System.out.print(list[i] + " ");
                        isDuplicate = true;
                    }
                    break;
                }
            }
        }
        if (!isDuplicate) {
            System.out.println("Bulunamadı.");
        }
        System.out.println();
    }
}
