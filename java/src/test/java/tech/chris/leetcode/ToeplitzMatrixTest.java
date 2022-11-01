package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.toeplitzMatrix.MySolution;

import java.util.stream.Stream;

public class ToeplitzMatrixTest {

    static Stream<Arguments> provideArgument () {
        return Stream.of(
            Arguments.of(new int[][]{{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}}, true),
            Arguments.of(new int[][]{{1, 2}, {2, 2}}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test1 (int[][] matrix, boolean expected) {
        Assertions.assertEquals(expected, new MySolution().isToeplitzMatrix(matrix));
    }
}
