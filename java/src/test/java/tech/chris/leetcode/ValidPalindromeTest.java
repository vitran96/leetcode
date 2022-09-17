package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ValidPalindromeTest {

    @ParameterizedTest
    @CsvSource({"'A man, a plan, a canal: Panama',true", "'race a car',false", "' ',true"})
    public void test (String input, boolean expected) {
        Assertions.assertEquals(expected, new ValidPalindrome().isPalindrome(input));
    }
}
