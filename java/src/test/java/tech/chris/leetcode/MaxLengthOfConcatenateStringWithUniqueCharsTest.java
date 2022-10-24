package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MaxLengthOfConcatenateStringWithUniqueCharsTest {
    static Stream<Arguments> provideArgument () {
        return Stream.of(Arguments.of(new String[]{"un", "iq", "ue"}, 4),
                         Arguments.of(new String[]{"cha", "r", "act", "ers"}, 6),
                         Arguments.of(new String[]{"abcdefghijklmnopqrstuvwxyz"}, 26));
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test1 (int input, int expected) {
        Assertions.assertEquals(expected, new tech.chris.leetcode.numberOf1Bits.MySolution().hammingWeight(input));
    }
}
