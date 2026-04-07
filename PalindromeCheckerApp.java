public class PalindromeChecker {

    // Main method - Entry point of the application
    public static void main(String[] args) {

        // Hardcoded string (String literal)
        String word = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check if the original string equals the reversed string
        if (word.equals(reversed)) {
            System.out.println("The string \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + word + "\" is not a palindrome.");
        }

        // Program exits
    }
}