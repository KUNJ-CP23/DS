import java.util.Scanner;
    public class Average{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        double n = sc.nextInt();
        double sum = 0;
        for(int i=1;i<=n;i++){
            sum = sum +i;
        }
        double avg = (sum)/n;
        System.out.println("Average = "+avg);
        sc.close();
    }
}