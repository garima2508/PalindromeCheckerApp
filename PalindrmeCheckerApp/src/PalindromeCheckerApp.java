import java.util.Scanner;

public class PalindromeCheckerApp {

    // Node class for the singly linked list
    static class Node {
        char data;
        Node next;

        Node(char d) {
            data = d;
            next = null;
        }
    }

    Node head; // Head of the linked list

    // Function to reverse the linked list
    private Node reverseList(Node head) {
        Node prev = null, current = head, next = null;
        while (current != null) {
            next = current.next; // Store next node
            current.next = prev; // Reverse current node's pointer
            prev = current;      // Move pointers one step ahead
            current = next;
        }
        return prev; // New head of the reversed list
    }

    // Function to check if the linked list is a palindrome
    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true; // Empty or single-node list is a palindrome
        }

        // 1. Find the middle of the linked list using fast and slow pointers
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next; // Slow moves one step
            fast = fast.next.next; // Fast moves two steps
        }

        // 'slow' is now at the middle or just before the middle for even length list

        // 2. Reverse the second half of the list
        Node secondHalfHead = reverseList(slow.next);
        slow.next = secondHalfHead; // Optional: Reconnect for list restoration later

        // 3. Compare the first half and the reversed second half
        Node p1 = head, p2 = secondHalfHead;
        boolean isPal = true;
        while (p2 != null) {
            if (p1.data != p2.data) {
                isPal = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        // 4. (Optional) Restore the original list structure
        // This is good practice for a general library function, not strictly needed for this problem's result
        // Node reversedSecondHalfAgain = reverseList(secondHalfHead);
        // slow.next = reversedSecondHalfAgain;

        return isPal;
    }

    // Function to convert a string to a linked list
    public void convertStringToLinkedList(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        head = new Node(str.charAt(0));
        Node current = head;
        for (int i = 1; i < str.length(); i++) {
            current.next = new Node(str.charAt(i));
            current = current.next;
        }
    }

    // Main method to take input and test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check for palindrome: ");
        String input = scanner.nextLine();
        scanner.close();

        PalindromeCheckerApp list = new PalindromeCheckerApp();
        list.convertStringToLinkedList(input);

        if (list.isPalindrome()) {
            System.out.println("The entered string/linked list is a palindrome.");
        } else {
            System.out.println("The entered string/linked list is not a palindrome.");
        }
    }
}
