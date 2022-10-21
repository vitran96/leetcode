package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class NumberOf1BitsTest {
    static Stream<Arguments> provideArgument () {
        return Stream.of(Arguments.of(Integer.parseUnsignedInt("00000000000000000000000000001011", 2), 3),
                         Arguments.of(Integer.parseUnsignedInt("00000000000000000000000010000000"), 1),
                         Arguments.of(Integer.parseUnsignedInt("11111111111111111111111111111101", 2), 31));
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test1 (int input, int expected) {
        Assertions.assertEquals(expected, new tech.chris.leetcode.numberOf1Bits.MySolution().hammingWeight(input));
    }
}
