import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class PalindromeCheckerApp {
    /**
     * Checks if the input string is a palindrome using a Deque.
     */
    public static boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Deque<Character> charDeque = new ArrayDeque<>();
        for (char c : cleanedStr.toCharArray()) {
            charDeque.addLast(c);
        }
        while (charDeque.size() > 1) {
            Character first = charDeque.removeFirst();
            Character last = charDeque.removeLast();
            if (!first.equals(last)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check for palindrome: ");
        String inputString = scanner.nextLine();
        scanner.close();

        if (isPalindrome(inputString)) {
            System.out.println("\"" + inputString + "\" is a palindrome.");
        } else {
            System.out.println("\"" + inputString + "\" is not a palindrome.");
        }
    }
}
