package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.binarySearch.Solution1;

import java.util.stream.Stream;

public class BinarySearchTest {

    static Stream<Arguments> provideArgument() {
        return Stream.of(
            Arguments.of(new int[]{-1, 0, 3, 5, 9, 12}, 9, 4),
            Arguments.of(new int[]{-1, 0, 3, 5, 9, 12}, 2, -1),
            Arguments.of(new int[]{5}, 5, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test(int[] nums, int target, int expected) {
        Assertions.assertEquals(expected, new Solution1().search(nums, target));
    }
}
