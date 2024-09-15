import java.util.*;
public class BinarySearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int n=sc.nextInt();

        //user defining sorted array 

        int s[]=new int[n];
        System.out.println("enter array:");
        for(int i=0;i<n;i++){
            s[i]=sc.nextInt();
        }

        //searching process

        System.out.println("enter any value for searching:");
        int value=sc.nextInt();
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(value==s[mid]){
                System.out.println("searching element index is:"+mid);
                break;
            }
            else if(value<s[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
    }
}
