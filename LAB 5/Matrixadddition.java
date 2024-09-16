import java.util.Scanner;
    public class Matrixadddition{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of rows : ");
            int r = sc.nextInt();
            System.out.print("Enter the number of coloumns : ");
            int c = sc.nextInt();
            int a [][] = new int[r][c];
            int b [][] = new int[r][c];
            int ans [][] = new int[r][c];

            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    System.out.print("Enter element into a["+i+"]["+j+"] : ");
                    a[i][j] = sc.nextInt();
                }
            }
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    System.out.print("Enter element into b["+i+"]["+j+"] : ");
                    b[i][j] = sc.nextInt();
                }
            }
            System.out.println("Sum : ");

            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    ans[i][j] = a[i][j] + b[i][j];  
                    System.out.print(+ans[i][j]); 
                    System.out.print(" ");                 
                }
                System.out.println();
            }
        sc.close();
    }
}