import java.util.Scanner;
    public class Prime{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            int count = 0;
            for(int i=2;i<=n;i++){
                if(n%i==0){
                    count++;
                }
            }
            if(count==1){
                System.out.println("Number is prime");
            }
            else{
                System.out.println("Number is not prime");
            }
        sc.close();
    }
}
