import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringBuilder toggledString = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isLowerCase(c)) {
                // Convert lowercase to uppercase
                toggledString.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                // Convert uppercase to lowercase
                toggledString.append(Character.toLowerCase(c));
            } else {
                // If it's not a letter, just append it
                toggledString.append(c);
            }
        }

        System.out.println("String after case toggling: " + toggledString.toString());

        sc.close();
    }
}
