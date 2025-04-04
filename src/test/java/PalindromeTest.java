import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

    private Palindrome palindrome = new Palindrome();

    @Test
    @DisplayName("should be a palindrome")
    void testcasewhichisapalindrome(){
        String input = "A man, a plan, a canal: Panama";
        assertTrue(palindrome.isPalindrome(input));
    }

    @Test
    @DisplayName("should not be a palindrome")
    void shouldGetBiggestNumberFromFivePairs(){
        String input = "race a car";
        assertFalse(palindrome.isPalindrome(input));
    }

    @Test
    @DisplayName("should be a palindrome")
    void sameFreq(){
        String input = " ";
        assertTrue(palindrome.isPalindrome(input));
    }

    @Test
    @DisplayName("should not be a palindrome")
    void validate(){
        String input = null;
        assertFalse(palindrome.isPalindrome(input));
    }
}
