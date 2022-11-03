package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.longestPalindromeByConcatenating2LetterWords.MySolution;

import java.util.stream.Stream;

public class LongestPalindromeByConcatenating2LetterWordsTest {
    static Stream<Arguments> provideArgument () {
        return Stream.of(
            Arguments.of(new String[]{"lc", "cl", "gg"}, 6),
            Arguments.of(new String[]{"ab", "ty", "yt", "lc", "cl", "ab"}, 8),
            Arguments.of(new String[]{"cc", "ll", "xx"}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test1 (String[] input, int expected) {
        Assertions.assertEquals(expected, new MySolution().longestPalindrome(input));
    }
}
