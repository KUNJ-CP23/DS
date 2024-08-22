import java.util.Scanner;
    public class Sumtilln11{
        public static void main(String[] args){
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                sum =sum+j;
            }
        }
        System.out.println("Sum = "+sum);
        sc.close();
    }
}