import java.util.Scanner;
    public class Circlearea{
        public static void main(String[] args){
         
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int r = sc.nextInt();
        double area = Math.PI*r*r;
        System.out.println("Area of circle is = "+area);
    }
}