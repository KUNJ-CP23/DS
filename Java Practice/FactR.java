import java.util.*;
    public class FactR{
        public static void main(String[] args){
            System.out.print("Enter the number: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int ans = fact(n);
            System.out.println(ans);
            sc.close();
            }       
                public static int fact(int n){
                    if(n==1){
                        return 1;
                    }
                    else{
                        return n*fact(n-1);
                    }
                }
}

    

