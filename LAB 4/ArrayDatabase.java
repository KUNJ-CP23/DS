import java.util.Scanner;

public class ArrayDatabase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int s = sc.nextInt();

        int[] array = new int[s];
        for (int i = 0; i < s; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        int sum = 0;
        int min = array[0];
        int max = array[0];

        for (int i = 0; i < s; i++) {
            // Sum
            sum += array[i];

            // Min
            if (array[i] < min) {
                min = array[i];
            }

            // Max
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Step 3: Calculate average
        double avg = (double) sum / s;

        // Step 4: Output the aggregate function results
        System.out.println("Sum: " + sum);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + avg);

        sc.close();
    }
}
