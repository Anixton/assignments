public class Main {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {2, 3, 4},
            {5, 6, 4}
        };
        
        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        printTranspose(matrix1);
        System.out.println();
        printTranspose(matrix2);
    }
    
    public static void printTranspose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int[][] transpose = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        
        System.out.println("Matris : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println();
        }
        
        System.out.println("Transpoze : ");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
