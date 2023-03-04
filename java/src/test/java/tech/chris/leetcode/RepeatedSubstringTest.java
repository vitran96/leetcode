package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.repeatedSubstring.Solution1;

import java.util.stream.Stream;

public class RepeatedSubstringTest {

    static Stream<Arguments> provideArgument() {
        return Stream.of(
            Arguments.of("abab", true),
            Arguments.of("aba", false),
            Arguments.of("abcabcabcabc", true),
            Arguments.of("ab", false),
            Arguments.of("a", false),
            Arguments.of("aabaaba", false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test1(String string, boolean expected) {
        Assertions.assertEquals(expected, new Solution1().repeatedSubstringPattern(string));
    }
}
