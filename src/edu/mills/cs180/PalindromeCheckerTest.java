package edu.mills.cs180;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PalindromeCheckerTest {

    @Test
    void isPalindrome_True_EmptyString() {
        assertTrue(PalindromeChecker.isPalindrome(""));
    }

    @ParameterizedTest
    @CsvSource({"AMA", "racecar", "x", "RacEcar"})
    void isPalindrome_Accepts_Palindrome(String input) {
        assertTrue(PalindromeChecker.isPalindrome(input));
    }

    @ParameterizedTest
    @CsvSource({"Java", "abc", "spatula"})
    void isPalindrome_Rejects_NotPalindrome(String input) {
        assertFalse(PalindromeChecker.isPalindrome(input));
    }
}
