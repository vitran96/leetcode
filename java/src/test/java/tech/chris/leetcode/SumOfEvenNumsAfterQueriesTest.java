package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SumOfEvenNumsAfterQueriesTest {
    static Stream<Arguments> provideArgument () {
        return Stream.of(Arguments.of(new int[]{1, 2, 3, 4},
                                      new int[][]{new int[]{1, 0}, new int[]{-3, 1}, new int[]{-4, 0}, new int[]{2, 3}},
                                      new int[]{8, 6, 2, 4}),
                         Arguments.of(new int[]{1}, new int[][]{new int[]{4, 0}}, new int[]{0}));
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test (int[] nums, int[][] queries, int[] expected) {
        Assertions.assertArrayEquals(expected, new SumOfEvenNumsAfterQueries().sumEvenAfterQueries(nums, queries));
    }
}
