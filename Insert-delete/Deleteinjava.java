import java.util.Scanner;
    public class Deleteinjava{
        public static void main(String[] args){
         
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of initial array = ");
        int s = sc.nextInt();
        System.out.print("Enter the index you want to delete the number at = ");
        int index = sc.nextInt();
        // System.out.print("Enter the number you want to  = ");
        // int n = sc.nextInt();
        int arr[] = new int[s];
        for(int i=0;i<s;i++){
            System.out.print("Enter element into arr["+i+"] : ");
            arr[i] = sc.nextInt();
        }

        int array [] = new int[s-1];
        for(int i=0;i<arr.length-1;i++){
            if(i>index){
                array[i] = arr[i];
            }
            else if(i==index){
                array[i] = arr[i+1];
                //or array[i-1] = arr[i];
            }
            else{
                array[i]=arr[i];
            }
        }

        for(int i=0;i<s-1;i++){
            System.out.println("Element into arr["+i+"] is : "+array[i]) ;
        }
        sc.close();
    }
}