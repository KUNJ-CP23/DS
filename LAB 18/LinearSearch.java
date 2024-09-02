import java.util.*;
public class LinearSearch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter array size:");
        int n=sc.nextInt();

        int s[]=new int[n];

        System.out.println("enter array:");

        for(int i=0;i<n;i++){
            s[i]=sc.nextInt();
        }

        System.out.println("enter any value for searching:");
        int value=sc.nextInt();

        boolean found = false; 

        for(int i=0;i<s.length;i++){
            if(s[i]==value){
                System.out.println("searching element index is:"+i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found in the array.");
        }
    }
}