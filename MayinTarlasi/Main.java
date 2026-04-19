import java.util.Random;
import java.util.Scanner;

class MineSweeper {
    int rowNumber;
    int colNumber;
    int size;
    String[][] map;
    String[][] board;
    boolean play;
    int remainingCells;

    public MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.size = rowNumber * colNumber;
        this.map = new String[rowNumber][colNumber];
        this.board = new String[rowNumber][colNumber];
        this.play = true;
        this.remainingCells = this.size - (this.size / 4);
    }

    public void run() {
        prepareGame();
        System.out.println("===========================");
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        
        Scanner scan = new Scanner(System.in);

        while (play) {
            printBoard(board);
            
            System.out.print("Satır Giriniz : ");
            int row = scan.nextInt();
            System.out.print("Sütun Giriniz : ");
            int col = scan.nextInt();
            
            System.out.println("===========================");
            
            if (row < 0 || row >= rowNumber || col < 0 || col >= colNumber) {
                System.out.println("Geçersiz koordinat! Lütfen sınırların içerisinde bir koordinat giriniz.");
                continue;
            }
            
            if (!board[row][col].equals("-")) {
                System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin.");
                continue;
            }

            if (map[row][col].equals("*")) {
                play = false;
                System.out.println("Game Over!!");
            } else {
                checkMine(row, col);
                if (remainingCells == 0) {
                    System.out.println("Oyunu Kazandınız !");
                    printBoard(board);
                    play = false;
                }
            }
        }
    }

    public void checkMine(int r, int c) {
        int count = 0;
        
        for (int i = r - 1; i <= r + 1; i++) {
            for (int j = c - 1; j <= c + 1; j++) {
                if (i >= 0 && i < rowNumber && j >= 0 && j < colNumber) {
                    if (map[i][j].equals("*")) {
                        count++;
                    }
                }
            }
        }
        
        board[r][c] = String.valueOf(count);
        remainingCells--;
    }

    public void prepareGame() {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                map[i][j] = "-";
                board[i][j] = "-";
            }
        }
        
        int mineCount = size / 4;
        Random rand = new Random();
        int count = 0;
        
        while (count < mineCount) {
            int randRow = rand.nextInt(rowNumber);
            int randCol = rand.nextInt(colNumber);
            
            if (!map[randRow][randCol].equals("*")) {
                map[randRow][randCol] = "*";
                count++;
            }
        }
    }

    public void printMap() {
        System.out.println("Mayınların Konumu");
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===========================");
    }

    public void printBoard(String[][] b) {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row, col;
                
        while (true) {
            System.out.print("Harita boyutu için Satır sayısını giriniz : ");
            row = scan.nextInt();
            System.out.print("Harita boyutu için Sütun sayısını giriniz : ");
            col = scan.nextInt();
            
            if (row >= 2 && col >= 2) {
                break;
            } else {
                System.out.println("Boyutlar minimum 2x2 olmalıdır. Lütfen tekrar giriniz.");
            }
        }
        
        MineSweeper mine = new MineSweeper(row, col);
        mine.run();
    }
}
