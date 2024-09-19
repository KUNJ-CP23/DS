import java.util.Scanner;
    public class Swapuserd{
        public static void main(String[] args){
         
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a and b = ");
        int arr[] = new int [2];
        System.out.print("Enter a = ");
        arr[0] = sc.nextInt();
        System.out.print("Enter b = ");
        arr[1] = sc.nextInt();
        System.out.println("Before swapping  = "+arr[0]+","+arr[1]);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println("Before swapping = "+a+","+b);
        // Swap(a,b);
        arr = Swap(arr);
        System.out.println("After swapping  = "+arr[0]+","+arr[1]);
        sc.close();
    }
    public static int[] Swap(int arr[]){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        return arr;
        // System.out.println("After swapping = "+a+","+b);
    }
}