import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string to check for palindrome: ");
        String inputString = scanner.nextLine();
        // Optional: Preprocess the string to ignore case and spaces for a robust check
        String cleanString = inputString.replaceAll("\\s+", "").toLowerCase();

        boolean isPal = isPalindrome(cleanString);
        if (isPal) {
            System.out.println("The input String \"" + inputString + "\" is a palindrome.");
        } else {
            System.out.println("The input String \"" + inputString + "\" is not a palindrome.");
        }
        scanner.close();
    }
    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
