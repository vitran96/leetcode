package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.int2roman.Solution1;

import java.util.stream.Stream;

public class Int2RomanTest {

    static Stream<Arguments> provideArgument() {
        return Stream.of(
            Arguments.of(3, "III"),
            Arguments.of(58, "LVIII"),
            Arguments.of(1994, "MCMXCIV"),
            Arguments.of(2994, "MMCMXCIV")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test1(int num, String expected) {
        Assertions.assertEquals(expected, new Solution1().intToRoman(num));
    }
}
