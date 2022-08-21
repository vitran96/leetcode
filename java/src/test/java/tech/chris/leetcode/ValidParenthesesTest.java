package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ValidParenthesesTest {

    @ParameterizedTest
    @CsvSource({"(),true", "()[]{},true", "(],false", "],false"})
    public void test(String input, boolean expected) {
        Assertions.assertEquals(expected, new ValidParentheses().isValid(input));
    }
}
