package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.whereWillTheBallFall.MySolution;

import java.util.stream.Stream;

public class WhereWillTheBallFallTest {

    static Stream<Arguments> provideArgument () {
        return Stream.of(
            Arguments.of(new int[][]{
                {1, 1, 1, -1, -1}, {1, 1, 1, -1, -1}, {-1, -1, -1, 1, 1}, {1, 1, 1, 1, -1}, {
                -1, -1, -1, -1, -1
            }
            }, new int[]{1, -1, -1, -1, -1}),
            Arguments.of(new int[][]{{-1}}, new int[]{-1}),
            Arguments.of(new int[][]{
                {1, 1, 1, 1, 1, 1}, {-1, -1, -1, -1, -1, -1}, {1, 1, 1, 1, 1, 1}, {
                -1, -1, -1, -1, -1, -1
            }
            }, new int[]{0, 1, 2, 3, 4, -1})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test1 (int[][] grid, int[] expected) {
        Assertions.assertArrayEquals(expected, new MySolution().findBall(grid));
    }
}
