import java.util.Scanner;
public class Merge_Sort{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array : ");
    int n = sc.nextInt();
    int a[] = new int [n];
    for(int i=0;i<n;i++){
        System.out.print("a["+i+"] : ");
        a[i] = sc.nextInt();
    }
    int low = 0;
    int high = n-1;
    mergesort(a,low,high);

    System.out.println("Sorted array : ");
    for(int k =0; k < a.length ; k++){
        System.out.println(a[k]);
    }
    sc.close();
}

public static void mergesort(int a[],int low,int high){
    if(low<high){
        int mid = (int) Math.floor((low+high)/2);
        mergesort(a, low, mid);
        mergesort(a, mid+1, high);
        merge(a, low, mid, high);
    }
}

public static void merge(int a[],int low, int mid, int high){
    int b[] = new int [high-low+1];
    int h = low;
    int i = 0;
    int j = mid+1;
    while(h<=mid && j<=high){
        if(a[h] <= a[j]){
            b[i] = a[h];
            h++;
        }
        else{
            b[i] = a[j];
            j++;
        }
        i++;
    }

    //vadhela element mate
    while(h<=mid){
        b[i++] = a[h++];
    }

    while(j<=high){
        b[i++] = a[j++];
    }

    for(int k = low; k<b.length ; k++){
        a[k] = b[k];
    }
}
    
}
    
