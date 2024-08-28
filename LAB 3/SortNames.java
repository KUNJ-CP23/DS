import java.util.Scanner;
import java.util.Arrays;

public class SortNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int N = sc.nextInt();
        sc.nextLine(); 
        
        
        String[] names = new String[N];
        System.out.println("Enter the names:");
        for (int i = 0; i < N; i++) {
            names[i] = sc.nextLine();
        }

        Arrays.sort(names);

        System.out.println("\nNames in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
