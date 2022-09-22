package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ReverseWordsInAString3Test {
    @ParameterizedTest
    @CsvSource({"Let's take LeetCode contest,s'teL ekat edoCteeL tsetnoc", "God Ding,doG gniD"})
    public void test (String input, String expected) {
        Assertions.assertEquals(expected, new ReverseWordsInAString3().reverseWords(input));
    }
}
