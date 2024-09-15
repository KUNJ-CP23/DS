import java.util.Scanner;
public class Radix_Sort{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter size of array : ");
    int size = sc.nextInt();

    int arr[] = new int [size];
    int place = 1;

    for(int i=0;i<size;i++){
        System.out.print("arr["+i+"] : ");
        arr[i] = sc.nextInt();
    }

    countSort(arr, place);
    radixsort(arr);
    printArray(arr);
    sc.close();
}
private static void countSort(int arr[], int place){
    int n = arr.length;
    int count[] = new int [10];
    int brr[] = new int [n];

    for (int i = 0; i < 10; i++) {
        count[i] = 0;
    }

    //counting frequency of each element
    for(int j = 0 ; j < n; j++){
        count[(arr[j]/place)%10] = count[(arr[j]/place)%10] + 1;
    }

    //updating c
    for(int i = 1; i< 10 ; i++){
        count[i] = count[i] + count[i-1];
    }

    for(int j = n -1; j>=0 ; j--){
        int digit = (arr[j]/place)%10;
        brr[count[digit]-1] = arr[j];
        count[digit]--;
    }
    for (int i = 0; i < n; i++) {
        arr[i] = brr[i];
    }
    
}

    public static void radixsort(int []arr){
        int max = getMax(arr);
        for (int place = 1; max / place > 0; place *= 10) {
            countSort(arr, place);
        }
    }

    //printing array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //to get maximum
    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
