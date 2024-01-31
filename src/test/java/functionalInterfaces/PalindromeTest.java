package functionalInterfaces;
import static org.junit.Assert.*;
import org.junit.Test;
public class PalindromeTest {
    @Test
    public void testIsPalindromePositive() {
        assertTrue(Palindrome.isPalindrome(121));
    }
    @Test
    public void testIsPalindromeNegative() {
        assertFalse(Palindrome.isPalindrome(123));
    }
    @Test
    public void testIsPalindromeSingleDigit() {
        assertTrue(Palindrome.isPalindrome(7));
    }
    @Test
    public void testIsPalindromeZero() {
        assertTrue(Palindrome.isPalindrome(0));
    }
    @Test
    public void testIsPalindromeNegativeNumber() {
        assertFalse(Palindrome.isPalindrome(-121));
    }
}
