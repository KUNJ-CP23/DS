import java.util.Scanner;
public class Counting_Sort{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter size of array : ");
    int n = sc.nextInt();

    int arr[] = new int [n];

    for(int i=0;i<n;i++){
        System.out.print("arr["+i+"] : ");
        arr[i] = sc.nextInt();
    }

    countSort(arr,n);
    
    sc.close();
}
public static void countSort(int arr[], int n){
    int max = arr[0];
    for(int i = 0 ; i < n ; i++){
        if(max<arr[i])
        max = arr[i];
    }

    int c[] = new int [max+1];

    //counting frequency of each element
    for(int j = 0 ; j < n; j++){
        c[arr[j]] = c[arr[j]] + 1;
    }

    //updating c
    for(int i = 1; i<=max ; i++){
        c[i] = c[i] + c[i-1];
        System.out.println(c[i]);
    }

    int brr[] = new int [n];
    for(int j = n -1; j>=0 ; j--){
        brr[c[arr[j]]-1] = arr[j];
        c[arr[j]] = c[arr[j]]-1;
    }

    System.out.println();
    System.out.println("---Sorted_Array---");
    for(int k=0;k<n;k++){
        System.out.println(brr[k] + " ");
    }
}
}
