import java.lang.*;
import java.util.Scanner;
public class PalindromeCheckerApp {
    /** program to reverse a string using loops */
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome:");
        String originalString = scanner.nextLine();
        String reversedString = "";
        int length = originalString.length();
        for (int i = length - 1; i >= 0; i--) {
            reversedString = reversedString + originalString.charAt(i);
        }
        if (originalString.equals(reversedString)) {
            System.out.println("Input string is a palindrome.");
        } else {
            System.out.println("Input string is not a palindrome.");
        }
    }
}
