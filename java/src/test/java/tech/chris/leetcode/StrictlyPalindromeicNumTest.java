package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.strictlyPalindromicNum.Solution1;

import java.util.stream.Stream;

public class StrictlyPalindromeicNumTest {

    static Stream<Arguments> provideArgument() {
        return Stream.of(
            Arguments.of(9, false),
            Arguments.of(4, false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test1(int n, boolean expected) {
        Assertions.assertEquals(expected, new Solution1().isStrictlyPalindromic(n));
    }
}