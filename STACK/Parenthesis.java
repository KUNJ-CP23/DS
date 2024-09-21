import java.util.Scanner;
import java.util.Stack;

public class Parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No of Test Cases: ");
        int T = sc.nextInt();
        sc.nextLine(); // next line consume

        for (int t = 0; t < T; t++) {
            String s = sc.nextLine();
            if (isBalanced(s)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            else if (ch == ')' || ch == '}' || ch == ']') {
                // If the stack is empty or doesn't match the top of the stack, return false
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}
