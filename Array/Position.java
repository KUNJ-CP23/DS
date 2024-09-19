import java.util.Scanner;
    public class Position{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size: ");
            int n = sc.nextInt();
            int arr[] = new int [n];
            for(int i=0;i<n;i++){
                System.out.print("Enter element into arr["+i+"] : ");
                arr[i] = sc.nextInt();
            }
            sc.close();
            int min = arr[0];
            int max = arr[0];  
            for(int i=1;i<n;i++){
                if(max<arr[i]){
                    max=arr[i];
                }
                if(min>arr[i]){
                    min=arr[i];
                }
            }
            System.out.println("Maximum : "+max);
            System.out.println("Minimum : "+min);
            
            for(int i=0;i<arr.length;i++){
                if(arr[i]==min){
                    System.out.println("Min position: "+i);
                }
                if(max==arr[i]){
                    System.out.println("Max position: "+i);
                }
            }
    }
}