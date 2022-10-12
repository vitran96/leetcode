package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ReverseBitsTest {
    static Stream<Arguments> provideArgument () {
        return Stream.of(Arguments.of(43261596, 964176192),
                         Arguments.of(Integer.parseUnsignedInt("4294967293"), Integer.parseUnsignedInt("3221225471")));
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test1 (int input, int expected) {
        Assertions.assertEquals(expected, new tech.chris.leetcode.reverseBits.MySolution().reverseBits(input));
    }
}
