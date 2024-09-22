import java.util.Stack;
import java.util.Scanner;

public class Postfix_Evaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter infix string: ");
        String post = sc.nextLine();
        double ans = evalutepostfix(post);
        System.out.println(ans);
        sc.close();
    }

    public static double evalutepostfix(String post){
        String[] str = post.split(",");
        for(int i = 0 ; i < str.length ; i++){
            str[i] = str[i].trim();
        }
        Stack<Double> s = new Stack<>();
        int rank = 0 ;
        double ans;

        //rank mate
        for(int i=0 ; i<str.length ; i++){
            String a = str[i];
            if (a.equals("+") || a.equals("-") | a.equals("*") || a.equals("/") || a.equals("^")) {
                rank--;
            }
            else{
                rank++;
            }
        }

        if (rank==1) {
            for(int i=0 ; i<str.length ; i++){
                String a = str[i];
                double operand1 , operand2;
                if (a.equals("+") || a.equals("-") || 
                    a.equals("*") || a.equals("/") || 
                    a.equals("^")) 
                {
                    operand1 = s.pop();
                    operand2 = s.pop();
                    s.push(operation(operand1, operand2, a));
                }
                else{
                    double num = Double.parseDouble(a);
                    s.push(num);
                }
            }
        }

        if (!s.isEmpty()) {
            ans = s.pop();
        }
        else{
            ans = -1;
        }
        return ans;
    }

    public static double operation(double operand1 , double operand2 , String a){
        if(a.equals("+")){
            return operand1 + operand2;
        }
        else if(a.equals("-")){
            return operand1 - operand2;
        }
        else if(a.equals("*")){
            return operand1 * operand2;
        }
        else if(a.equals("/")){
            return operand1 / operand2;
        }
        else if(a.equals("^")){
            return Math.pow(operand1, operand2);
        }
        else{
            return 1;
        }
    }
}
