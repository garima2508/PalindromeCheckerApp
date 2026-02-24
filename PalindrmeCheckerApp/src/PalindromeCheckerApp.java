import java.lang.*;
import java.util.Scanner;
public class PalindromeCheckerApp {
    /** program to reverse a string using loops */
    public static boolean isPalindrome(String inputString) {
        char[] charArray = inputString.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String testString1 = "madam";
        String testString2 = "hello";
        System.out.println("\"" + testString1 + "\" is a palindrome: " + isPalindrome(testString1));
        System.out.println("\"" + testString2 + "\" is a palindrome: " + isPalindrome(testString2));
    }
}
