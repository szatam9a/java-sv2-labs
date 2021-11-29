package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void isPalindromeTest() {
    Palindrome palindrome = new Palindrome();
    palindrome.isPalindrome("noon");
    assertTrue(palindrome.isPalindrome("noon"));
    assertTrue(palindrome.isPalindrome("nooon"));
    assertFalse(palindrome.isPalindrome("noonn"));
    assertFalse(palindrome.isPalindrome("nnoon"));
    assertFalse(palindrome.isPalindrome("nnnoonn"));
    }
}