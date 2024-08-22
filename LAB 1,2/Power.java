import java.util.Scanner;
    public class Power{
        public static void main(String[] args){
        System.out.println("Enter number and power : ");
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double temp = n;
        Scanner sca = new Scanner(System.in);
        double p = sca.nextDouble();
        double ans = 1;
        // double ans = Math.pow(n,p);
        for(int i=1;i<=p;i++){
            ans = ans*n;
        }
        System.out.println(temp+"^"+p+" = "+ans);
        sc.close();
    }
}