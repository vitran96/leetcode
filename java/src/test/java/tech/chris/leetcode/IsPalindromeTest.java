package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class IsPalindromeTest {

    @ParameterizedTest
    @CsvSource({"121,true", "-121,false", "10,false", "0,true", "-1,false", "5,true", "1221,true"})
    public void test(int input, boolean expected) {
        Assertions.assertEquals(expected, IsPalindrome.solution(input));
    }
}
