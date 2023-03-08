package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.kthMissingPositiveNumber.Solution1;

import java.util.stream.Stream;

public class KthMissingPositiveNumberTest {

    static Stream<Arguments> provideArgument() {
        return Stream.of(
            Arguments.of(new int[]{2, 3, 4, 7, 11}, 5, 9),
            Arguments.of(new int[]{1, 2, 3, 4}, 2, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test(int[] input, int expected) {
        Assertions.assertEquals(expected, new Solution1().maxProfit(input));
    }
}
