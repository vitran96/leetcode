package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.shortestPathInGridWithWallDestroy.MySolution;

import java.util.stream.Stream;

public class ShortestPathInGridWithWallDestroyTest {

    static Stream<Arguments> provideArgument () {
        return Stream.of(
            Arguments.of(new int[][]{
                new int[]{0, 0, 0}, new int[]{1, 1, 0}, new int[]{0, 0, 0}, new int[]{0, 1, 1}, new int[]{0, 0, 0}
            }, 1, 6),
            Arguments.of(new int[][]{new int[]{0, 1, 1}, new int[]{1, 1, 1}, new int[]{1, 0, 0}}, 1, -1),
            Arguments.of(new int[][]{new int[]{0, 1, 0}}, 1, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test1 (int[][] grid, int k, int expected) {
        Assertions.assertEquals(expected, new MySolution().shortestPath(grid, k));
    }
}
