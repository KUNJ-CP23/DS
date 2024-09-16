import java.util.Scanner;
    public class Multiplymatrix{
        public static void main(String[] args){
         
        Scanner sc = new Scanner(System.in);

        int a [][] = new int[3][2];
            int b [][] = new int[2][3];
            int ans [][] = new int[3][3];

            for(int i=0;i<3;i++){
                for(int j=0;j<2;j++){
                    System.out.print("Enter element into a["+i+"]["+j+"] : ");
                    a[i][j] = sc.nextInt();
                }
            }
            for(int i=0;i<2;i++){
                for(int j=0;j<3;j++){
                    System.out.print("Enter element into b["+i+"]["+j+"] : ");
                    b[i][j] = sc.nextInt();
                }
            }
            System.out.println("Multiplication of matrix : ");

            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    
                    ans[i][j] = 0;
                     for(int k=0;k<2;k++){
                        ans[i][j] += a[i][k] * b[k][j];
                        // System.out.println(ans[i][j]);
                     }
                    
                }
            }

            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    
                    // ans[i][j] = 0;
                     
                        // ans[i][j] += a[i][k] * b[k][j];
                        System.out.print(ans[i][j]);
                        System.out.print(" ");
                    
                }
                System.out.println();
            }
            
        sc.close();
    }
}