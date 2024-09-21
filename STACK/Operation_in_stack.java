import java.util.Scanner;

public class Operation_in_stack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = sc.nextInt();
        Stack stack = new Stack(size); 

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peep");
            System.out.println("4. Change");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    int temp = stack.pop();
                    System.out.println(temp+" is popped");
                    break;
                case 3:
                    System.out.print("Enter the position from top to peep: ");
                    int pos = sc.nextInt();
                    stack.peep(pos);
                    break;
                case 4:
                    System.out.print("Enter new value: ");
                    int x = sc.nextInt();
                    System.out.print("Enter the position from top to change: ");
                    int i = sc.nextInt();
                    stack.change(x, i);
                    break;
                case 5:
                    stack.display();
                    break;
                case 6:
                    System.out.println("Exit");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid input. Pachu nakhi jovo.");
            }
        }
        
    }
}
class Stack{

    int top = -1;
    int max;
    int i;
    int s[];


    public Stack(int size){
        max = size;
        s = new int[max];
        top = -1;
    }
    public void push(int x){

        if(top>=(s.length-1)){
            System.out.println("Stack overflow");
        }
        else{
            top++;
            s[top] = x;
            System.out.println(x+" is pushed");
        }
    }

    public int pop(){
        if(top==-1){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            int temp=s[top];
            top--;
            return temp; 
        }
    }

    public int peep(int i){
        if((top-i+1)<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            return s[top-i+1];
        }
    }
    public void change(int x, int i){
        if((top-i+1)<=0){
            System.out.println("Stack underflow");
            return;
        }
        else{
            s[top-i+1] = x;
        }
    }

    public int display(){
        if(top==0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            for(int i=top;i>=0;i--){
                System.out.println(s[i]);
            }
        }
        return 0;
    }
}