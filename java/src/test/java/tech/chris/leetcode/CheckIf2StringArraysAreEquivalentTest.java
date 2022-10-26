package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.checkIf2StringArraysAreEquivalent.MySolution;

import java.util.stream.Stream;

public class CheckIf2StringArraysAreEquivalentTest {

    static Stream<Arguments> provideArgument () {
        return Stream.of(
            Arguments.of(new String[]{"ab", "c"}, new String[]{"a", "bc"}, true),
            Arguments.of(new String[]{"a", "cb"}, new String[]{"ab", "c"}, false),
            Arguments.of(new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test (String[] word1, String[] word2, boolean expected) {
        Assertions.assertEquals(expected, new MySolution().arrayStringsAreEqual(word1, word2));
    }
}
