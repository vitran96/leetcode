package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.countSubarraysWIthFixedBounds.Solution1;

import java.util.stream.Stream;

public class CountSubarraysWithFixedBoundsTest {

    static Stream<Arguments> provideArgument() {
        return Stream.of(
            Arguments.of(new int[]{7, 1, 5, 3, 6, 4}, 1, 5, 2),
            Arguments.of(new int[]{1, 1, 1, 1}, 1, 1, 10),
            Arguments.of(new int[]{3, 2, 4, 1, 3, 5, 2, 5, 3, 2, 4}, 1, 5, 24)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test(int[] input, int minK, int maxK, int expected) {
        Assertions.assertEquals(expected, new Solution1().countSubarrays(input, minK, maxK));
    }
}
