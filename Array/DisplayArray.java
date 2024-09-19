import java.util.Scanner;
    public class DisplayArray{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array or numbers to display : ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            System.out.print("Enter element into arr["+i+"] : ");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("arr["+i+"] is : "+arr[i]) ;
        }
        sc.close();
    }
}