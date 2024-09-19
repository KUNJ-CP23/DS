import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

    public class Anagram{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //user ne pucho ketla words no array joiye
            System.out.println("Enter the number you want to add: ");
            int n = sc.nextInt();
            sc.nextLine(); // consume newline character

            String arr[] = new String[n];
            for(int i=0;i<n;i++){
                System.out.print("Enter word at ["+(i+1)+"] : ");
                arr[i] = sc.nextLine();
            }

            Random r = new Random();
            int randomIndex = r.nextInt(n-1);

            String selected = arr[randomIndex];
            System.out.println("Your word is: " + selected);
            System.out.println("Enter an anagram of the word: ");
            String usernakhelu = sc.nextLine();

            if(isAnagram(selected, usernakhelu)){
                System.out.println("Correct! " + usernakhelu + " is an anagram of " + selected);
            }
            else{
                System.out.println("Incorrect. " + usernakhelu + " is not an anagram of " + selected);
            }

        sc.close();
    }

    public static boolean isAnagram(String word1, String word2) {
        // Converting words to char arrays
        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();

        // w,h,o and h,o,w sort thase ek ek
        Arrays.sort(word1Array);
        Arrays.sort(word2Array);

        if (word1Array.length != word2Array.length) {
            return false;
        }

        for (int i = 0; i < word1Array.length; i++) {
            if (word1Array[i] != word2Array[i]) {
                return false;
            }
        }

        return true;
    
    }

}







