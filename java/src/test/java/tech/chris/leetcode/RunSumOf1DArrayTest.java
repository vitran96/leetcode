package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.runSumOf1DArray.Solution1;

import java.util.stream.Stream;

public class RunSumOf1DArrayTest {

    static Stream<Arguments> provideArgument() {
        return Stream.of(
            Arguments.of(new int[]{1, 2, 3, 4}, new int[]{1, 3, 6, 10}),
            Arguments.of(new int[]{1, 1, 1, 1, 1}, new int[]{1, 2, 3, 4, 5}),
            Arguments.of(new int[]{3, 1, 2, 10, 1}, new int[]{3, 4, 6, 16, 17})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test(int[] input, int[] expected) {
        Assertions.assertArrayEquals(expected, new Solution1().runningSum(input));
    }
}
