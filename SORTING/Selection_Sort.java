import java.util.Scanner;
    public class Selection_Sort{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int arr[] = new int [n];

        for(int i=0;i<n;i++){
            System.out.print("arr["+i+"] : ");
            arr[i] = sc.nextInt();
        }
    
        selectionSort(arr);
        
        sc.close();
    }
    public static void selectionSort(int arr[]){

        for(int i=0;i<arr.length-1;i++){
            int min_index = i;
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            if(min_index != i){
                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
            }
        }

        System.out.println();
        System.out.println("---Sorted_Array---");
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k] + " ");
        }
    }
}
