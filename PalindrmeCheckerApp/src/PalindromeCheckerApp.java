import java.util.Scanner;
public class PalindromeCheckerApp {
    /**
     * Recursive method to check if a substring is a palindrome.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String to check:");
        String inputString = scanner.nextLine();
        inputString = inputString.toLowerCase();
        scanner.close();
        if (isPalindromeRecursive(inputString, 0, inputString.length() - 1)) {
            System.out.println("\"" + inputString + "\" is a palindrome.");
        } else {
            System.out.println("\"" + inputString + "\" is not a palindrome.");
        }
    }
    public static boolean isPalindromeRecursive(String s, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (s.charAt(left) == s.charAt(right)) {
            return isPalindromeRecursive(s, left + 1, right - 1);
        } else {
            return false;
        }
    }
}
