public class PalindromeChecker {

    public static void main(String[] args) {

        // Original string (hardcoded)
        String input = "radar";

        // Convert string to character array
        char[] chars = input.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = chars.length - 1;

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare characters from both ends
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }
    }
}