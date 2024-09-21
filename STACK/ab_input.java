import java.util.*;
import java.util.Stack;

public class ab_input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        if (isValidString(input) && equalityCheck(input)) {
            System.out.println("Valid String");
        }
        else {
            System.out.println("Invalid string");
        }
        sc.close();
    }

    public static boolean isValidString(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != 'a' && ch != 'b') {
                return false;
            }
        }
        return true;
    }

    public static boolean equalityCheck(String str){
        Stack <Character> stack1 = new Stack<>();
        Stack <Character> stack2 = new Stack<>();

        for(int i = 0; i < str.length(); i++){
           char ch = str.charAt(i); 
            if(ch == 'a') 
            {
            stack1.push(ch);
            } 
            else if(ch == 'b') 
            {
            stack2.push(ch);
            }
            else
            {
                System.out.println("Invalid string");
            }
        
    }
    return stack1.size() == stack2.size();

}
}

