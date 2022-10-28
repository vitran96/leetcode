package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.imageOverlap.MySolution;

import java.util.stream.Stream;

public class ImageOverlapTest {

    static Stream<Arguments> provideArgument () {
        return Stream.of(
            Arguments.of(
                new int[][]{new int[]{1, 1, 0}, new int[]{0, 1, 0}, new int[]{0, 1, 0}},
                new int[][]{new int[]{0, 0, 0}, new int[]{0, 1, 1}, new int[]{0, 0, 1}},
                3
            ),
            Arguments.of(new int[][]{new int[]{1}}, new int[][]{new int[]{1}}, 1),
            Arguments.of(new int[][]{new int[]{0}}, new int[][]{new int[]{0}}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test1 (int[][] img1, int[][] img2, int expected) {
        Assertions.assertEquals(expected, new MySolution().largestOverlap(img1, img2));
    }
}
