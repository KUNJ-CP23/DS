import java.util.Scanner;
    public class Factors{
        public static void main(String[] args){
        System.err.println("Enter the number : "); 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                if(n==i){
                    System.out.print(i+" are the factors of "+n);
                }
                else{
                    System.out.print(i+" , ");

                }
            }
            // else{
            //     System.out.println("");
            // }
        }
        sc.close();
    }
}
