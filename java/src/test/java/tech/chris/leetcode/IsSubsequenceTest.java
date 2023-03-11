package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.isSubsequence.Solution1;

import java.util.stream.Stream;

public class IsSubsequenceTest {

    static Stream<Arguments> provideArgument() {
        return Stream.of(
            Arguments.of("abc", "ahbgdc", true),
            Arguments.of("axc", "ahbgdc", false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test(String s, String t, boolean expected) {
        Assertions.assertEquals(expected, new Solution1().isSubsequence(s, t));
    }
}
