import java.util.Scanner;
    public class BubbleSort{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int [n];

        for(int i=0;i<n;i++){
            System.out.print("arr["+i+"] : ");
            arr[i] = sc.nextInt();
        }

        int temp;
        for(int i=0; i<n-1;i++){
            
            for(int j=0;j<n-i-1;j++){

                if(arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        
        System.out.println("Bubble Sorted array:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}