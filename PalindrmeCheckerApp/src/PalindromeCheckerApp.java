import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to demonstrate FIFO vs LIFO: ");
        String inputString = scanner.nextLine();
        scanner.close();
        Queue<Character> charQueue = new LinkedList<>();
        Stack<Character> charStack = new Stack<>();
        for (char character : inputString.toCharArray()) {
            charQueue.add(character);
            charStack.push(character);
        }
        System.out.println("\nOriginal Input String: " + inputString);
        System.out.println("\n--- Queue (FIFO) Operations ---");
        System.out.print("Dequeue order: ");
        while (!charQueue.isEmpty()) {
            System.out.print(charQueue.poll() + " ");
        }
        System.out.println("\nExplanation: Elements are removed in the order they were inserted (First-In, First-Out).");
        System.out.println("\n--- Stack (LIFO) Operations ---");
        System.out.print("Pop order: ");
        while (!charStack.isEmpty()) {
            System.out.print(charStack.pop() + " ");
        }
        System.out.println("\nExplanation: Elements are removed in the reverse order of insertion (Last-In, First-Out).");
        System.out.println("\n--- Logical Comparison (Palindrome Check) ---");
        boolean isPalindrome = true;
        Queue<Character> queueForComparison = new LinkedList<>();
        Stack<Character> stackForComparison = new Stack<>();
        for (char character : inputString.toCharArray()) {
            queueForComparison.add(character);
            stackForComparison.push(character);
        }
        while (!queueForComparison.isEmpty()) {
            if (queueForComparison.poll() != stackForComparison.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Result: The input string is a palindrome.");
        } else {
            System.out.println("Result: The input string is not a palindrome.");
        }
    }
}
