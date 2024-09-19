import java.util.Scanner;

public class ReplaceNumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size =  ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Elements in array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter x, number to be replaced: ");
        int x = sc.nextInt();
        System.out.print("Enter y, number to replace with: ");
        int y = sc.nextInt();

        boolean replaced = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                arr[i] = y;
                System.out.println("aa index a replace thay che : " + i);
                replaced = true;
            }
        }

        //number karvo che a che bhi k nay
        if (!replaced) {
            System.out.println("x not found in array");
        }

        System.out.println("x Replaced by y array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
