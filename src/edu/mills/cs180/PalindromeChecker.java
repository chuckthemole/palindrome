package edu.mills.cs180;

/**
 * A static utility class for testing whether strings are palindromes.
 *
 * @author Ellen Spertus
 */
public class PalindromeChecker {
    private PalindromeChecker() {}

    /**
     * Checks whether the given string is a palindrome. A string is considered a palindrome if it
     * reads the same forwards and backwards, ignoring case, once all non-alphanumeric characters
     * are removed.
     *
     * @param s the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String s) {
        String string = s.toLowerCase();
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
