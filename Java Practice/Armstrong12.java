public class Armstrong12 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            int number = i;
            int originalNumber = number;
            int sum = 0;

            // Count karo number of digits, a number ma ketla che
            int digits = 0;
            while (number != 0) {
                digits++;
                number /= 10;
            }

            // number j hato a pacho lavo pade cause upar operation thyu so
            number = originalNumber;

            // Calculate the sum of digits raised to the power of the number of digits
            while (number != 0) {
                int n = number % 10;
                sum += Math.pow(n, digits);
                number /= 10;
            }

            // Check if the sum is equal to the original number
            if (sum == originalNumber) {
                System.out.println(originalNumber);
            }
        }
    }
}



// public class Armstrong {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 1000; i++) {
//             if (isArmstrong(i)) {
//                 System.out.println(i);
//             }
//         }
//     }

//     // Method to count the number of digits in a number
//     public static int countDigits(int number) {
//         int count = 0;
//         while (number != 0) {
//             count++;
//             number /= 10;
//         }
//         return count;
//     }

//     // Method to check if a number is an Armstrong number
//     public static boolean isArmstrong(int number) {
//         int originalNumber = number;
//         int sum = 0;
//         int digits = countDigits(number);
//         int temp = number; // Use a temporary variable to avoid modifying the original number

//         while (temp != 0) {
//             int digit = temp % 10;
//             sum += Math.pow(digit, digits);
//             temp /= 10;
//         }

//         return sum == originalNumber;
//     }
// }
