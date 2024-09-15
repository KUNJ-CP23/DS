import java.util.Scanner;
    public class Shell_Sort{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int arr[] = new int [n];

        for(int i=0;i<n;i++){
            System.out.print("arr["+i+"] : ");
            arr[i] = sc.nextInt();
        }
    
        shellSort(arr);
        
        sc.close();
    }
    public static void shellSort(int arr[]){
        int n = arr.length;
        int temp=0;
        int gap=n/2;
            for( gap=n/2 ; gap>=1 ; gap=gap/2){

                for(int j=gap ; j<n ;j++){

                    for(int i=j-gap ; i>=0 ; i=i-gap){
                        if(arr[i+gap]>arr[i]) break;
                        else {
                        temp=arr[i+gap];
                        arr[i+gap]=arr[i];
                        arr[i]=temp;
                            //swap(a[i+gap],a[i]);
                    }
                }
            }
        }


        System.out.println();
        System.out.println("---Sorted_Array---");
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k] + " ");
        }
    }
}
