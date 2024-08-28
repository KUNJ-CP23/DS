import java.util.*;
class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int []nums = new int[n];
        int count=0;

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        if (n == 0) {
            System.err.println("not found");
            return;
        }
        boolean hasDupe = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    hasDupe =  true; // Duplicate found
                    break;
                }
            }
        }

        if (!hasDupe) {
            System.out.println("No duplicates found");
        }
        else{
            System.out.println("array contains dupes");
        }

        sc.close();
    }
    
}

// import java.util.*;

// class Duplicate {
//     public static void main(String[] args) { 
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size: ");
//         int n = sc.nextInt();
//         int[] nums = new int[n];

//         for (int i = 0; i < n; i++) {
//             System.out.print("arr[" + i + "] : ");
//             nums[i] = sc.nextInt();
//         }

//         if (n == 0) {
//             System.err.println("Array is empty");
//             return;
//         }

//         boolean hasDupe = false;
        
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (nums[i] == nums[j]) {
//                     // Shift elements to the left to remove the duplicate
//                     for (int k = j; k < n - 1; k++) {
//                         nums[k] = nums[k + 1];
//                     }
//                     n--; // Decrease the size of the array
//                     j--; // Recheck the current position
//                     hasDupe = true;
//                 }
//             }
//         }

//         // Display results
//         if (hasDupe) {
//             System.out.println("Array after removing duplicates:");
//             for (int i = 0; i < n; i++) {
//                 System.out.print(nums[i] + " ");
//             }
//         } else {
//             System.out.println("No duplicates found");
//         }

//         sc.close();
//     }
// }
