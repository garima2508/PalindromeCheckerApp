import java.lang.*;
public class PalindromeCheckerApp {
    /** program to check the hardcoded string(madam) is palindrome or not */
    public static void main(String [] args){
        String input="madam";
        boolean isPalindrome=true;
        int j=input.length();
        for(int i=0; i< input.length() /2 ;i++){
            if(input.charAt(i) != input.charAt(input.length()-1-i)) {
                isPalindrome=false;
                break;
            }
        }
            System.out.println("Is palindrome? "+isPalindrome);
    }
}
