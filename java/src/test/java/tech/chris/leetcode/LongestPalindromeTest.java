package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.longestPalindrome.Solution1;

import java.util.stream.Stream;

public class LongestPalindromeTest {

    static Stream<Arguments> provideArgument() {
        return Stream.of(
            Arguments.of("abccccdd", 7),
            Arguments.of("Aa", 1),
            Arguments.of("a", 1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test(String s, int expected) {
        Assertions.assertEquals(expected, new Solution1().longestPalindrome(s));
    }
}
