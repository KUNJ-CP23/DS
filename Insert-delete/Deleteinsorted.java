import java.util.Scanner;

public class Deleteinsorted {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the initial array = ");
        int s = sc.nextInt();

        int arr[] = new int[s];
        for (int i = 0; i < s; i++) {
            System.out.print("Enter element into arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to be deleted = ");
        int key = sc.nextInt();

        int index = -1;
        for (int i = 0; i < s; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < s - 1; i++) {
                arr[i] = arr[i + 1];
            }
            s--;
        } else {
            System.out.println("Number not found in the array.");
        }

        System.out.println("Array after deletion:");
        for (int i = 0; i < s; i++) {
            System.out.println("Element in arr[" + i + "] is : " + arr[i]);
        }

        sc.close();
    }
}
