import java.util.Scanner;
    public class Vowelcons{
        public static void main(String[] args){
         
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character : ");
        char c = sc.next().charAt(0);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' ||c=='U'){
            System.out.println("Character is vowel");
        }
        else{
            System.out.println("Character is consonent");
        }
        sc.close();
    }
}