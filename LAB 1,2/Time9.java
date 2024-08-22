import java.util.Scanner;
    public class Time9{
        public static void main(String[] args){
        System.out.print("Enter time in seconds: ");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int h = t/3600;
        int m = (t%3600)/60;
        int s = (t%3600)%60;    //s=(t%3600)-(m*60);
        System.out.printf("Converted time: %02d:%02d:%02d\n", h, m, s);
        sc.close();
    }
}