
import java.util.*;
import java.util.Stack;

public class Recognize_stack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        if (isValidString(input) && recognize(input)) 
        {
            System.out.println("Valid string");
        } 
        else 
        {
            System.out.println("Invalid string");
        }

        sc.close();
    }

    //string ma user a,b,c sivaay kaay na nakhe a na mate, checks validity

    public static boolean isValidString(String str) {
        int cCount=0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != 'a' && ch != 'b' && ch != 'c') {
                return false;
            }
            if (ch == 'c') {
                cCount++;
            }
        }
        // Check if there is exactly one 'c'
        if (cCount != 1) {
            return false;
        }

        // Check if 'c' is in the center
        int length = str.length();
        int centerIndex = length / 2;
        if (length % 2 == 0 || str.charAt(centerIndex) != 'c') {
            return false;
        }

        return true;
    }
    public static boolean recognize(String str) {

        //in-built stack used
        Stack<Character> stack = new Stack<>();
        int length = str.length();

        // string no pelo half push kare stack ma
        for (int i = 0; i < length/2; i++) {
            if(str.charAt(i)==' ')
            {
                System.out.println("Invalid string");
            }
            else
            {
                stack.push(str.charAt(i));
            }
        }

        // length odd hoi to middle character skipped
        int start;
        if(length%2 == 0)
        {
            start = length/2;
        }
        else
        {
            start = length/2 + 1;
        }

        // string na second half thi compare mate
        for (int i = start; i < length; i++) {
            if (stack.isEmpty() || str.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}