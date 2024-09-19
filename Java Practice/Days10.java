import java.util.Scanner;
    public class Days10{
        public static void main(String[] args){
        System.out.print("Enter days: ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int y = day/365;
        int m = (day%365)/7;
        int d = (day%365)%7;    //s=(t%3600)-(m*60);
        System.out.printf("Converted time: %d year, %d week, %d days \n", y, m, d);
        sc.close();
    }
}