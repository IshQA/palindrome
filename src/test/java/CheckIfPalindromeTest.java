import org.junit.Test;

import static org.junit.Assert.*;

public class CheckIfPalindromeTest {

    private String palindromeSentence = "A man, a plan, a canal, Panama!";
    private String notPalindrome = "This is not palindrome.";
    private String palindromeOddNumbers = "3456543"; //odd number of characters
    private String palindromeEvenNumbers = "12344321"; //even number of characters

    @Test
    public void inputWithoutPunctuationOdd(){
        assertTrue(CheckIfPalindrome.isCharTheSame(palindromeOddNumbers));
    }

    @Test
    public void inputWithoutPunctuationEven(){
        assertTrue(CheckIfPalindrome.isCharTheSame(palindromeEvenNumbers));
    }

    @Test
    public void cutPunctuation(){
        String sentence = palindromeSentence;
        assertEquals("AMANAPLANACANALPANAMA", CheckIfPalindrome.stringWithoutPunctuation(sentence));
    }

    @Test
    public void isPalindrome() {
        assertTrue(CheckIfPalindrome.isPalindrome(palindromeSentence));
    }

    @Test
    public void isNotPalindrome() {
        assertFalse(CheckIfPalindrome.isPalindrome(notPalindrome));
    }


}

