import java.util.Scanner;

public class PascalTriangle19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows for Pascal's Triangle: ");
        int rows = scanner.nextInt();
        
        printPascalsTriangle(rows);
        scanner.close();
    }

    // Method to print Pascal's Triangle
    public static void printPascalsTriangle(int rows) {
        
        for (int i = 0; i < rows; i++) {
            //space mate
            for (int k = 0; k < rows - i; k++) {
                System.out.print(" "); 
            }
            
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
