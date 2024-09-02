import java.util.Scanner;
public class Quick_Sort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int [n];

        for(int i=0;i<n;i++){
            System.out.print("arr["+i+"] : ");
            arr[i] = sc.nextInt();
        }

        int lb = 0;
        int ub = n-1;
        quickSort(arr,lb,ub);

        System.out.println("Sorted array : ");
        for(int k =0; k < arr.length ; k++){
        System.out.println(arr[k]);
        }

        sc.close();
}

    public static void quickSort(int []arr, int lb, int ub){
        boolean flag = true;
        int i = lb;
        int j = ub + 1;
        int key = arr[lb];
        if(lb<ub){
            while(flag){
                i++;
                while(arr[i]<key){
                    i++;
                }
                j--;
                while(arr[j]>key){
                    j--;
                }
                if(i<j){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }else{
                    flag=false;
                }
            }

            int temp=arr[lb];
            arr[lb]=arr[j];
            arr[j]=temp;
        }
        else{
            return;
        }

        quickSort(arr,lb,j-1);
        quickSort(arr,j+1,ub);
    }
}
