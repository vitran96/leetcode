package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.findPivotIndex.Solution1;

import java.util.stream.Stream;

public class FindPivotIndexTest {

    static Stream<Arguments> provideArgument() {
        return Stream.of(
            Arguments.of(new int[]{1, 7, 3, 6, 5, 6}, 3),
            Arguments.of(new int[]{1, 2, 3}, -1),
            Arguments.of(new int[]{2, 1, -1}, 0),
            Arguments.of(new int[]{1, 1}, -1),
            Arguments.of(new int[]{1, 0}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test(int[] nums, int expected) {
        Assertions.assertEquals(expected, new Solution1().pivotIndex(nums));
    }
}
