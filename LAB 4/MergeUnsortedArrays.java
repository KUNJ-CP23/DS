import java.util.Scanner;

public class MergeUnsortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //pelo arry
        System.out.print("Enter the size of the first array: ");
        int s1 = sc.nextInt();
        int[] array1 = new int[s1];
        for (int i = 0; i < s1; i++) {
            System.out.print("array1[" + i + "]: ");
            array1[i] = sc.nextInt();
        }

        //bijo array
        System.out.print("Enter the size of the second array: ");
        int s2 = sc.nextInt();
        int[] array2 = new int[s2];
        for (int i = 0; i < s2; i++) {
            System.out.print("array2[" + i + "]: ");
            array2[i] = sc.nextInt();
        }

        // Step 3: Create a third array to store the merged result
        int[] mergedArray = new int[s1 + s2];

        // Step 4: Copy elements of array1 to mergedArray
        for (int i = 0; i < s1; i++) {
            mergedArray[i] = array1[i];
        }

        // Step 5: Copy elements of array2 to mergedArray
        for (int i = 0; i < s2; i++) {
            mergedArray[s1 + i] = array2[i];
        }

        // Step 6: Print the merged array
        System.out.println("Merged array:");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }

        sc.close();
    }
}
