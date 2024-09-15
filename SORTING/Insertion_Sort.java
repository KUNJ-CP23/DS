import java.util.Scanner;
    public class Insertion_Sort{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int arr[] = new int [n];

        for(int i=0;i<n;i++){
            System.out.print("arr["+i+"] : ");
            arr[i] = sc.nextInt();
        }
    
        insertionSort(arr);
        
        sc.close();
    }
    public static void insertionSort(int arr[]){

        // for(int i=0;i<arr.length;i++){
        //     int key = arr[i];
        //     int j;

        //     for(j=i-1;j>=0 && arr[j]>key;j--){
        //         arr[j+1] = arr[j];
        //     }
            
        //     arr[j+1]=key;
        // }

        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            
            arr[j+1]=key;
        }

        System.out.println();
        System.out.println("---Sorted_Array---");
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k] + " ");
        }
    }
}
