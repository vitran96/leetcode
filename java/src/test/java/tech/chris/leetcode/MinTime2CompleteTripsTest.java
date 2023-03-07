package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.minTime2CompleteTrips.Solution1;

import java.util.stream.Stream;

public class MinTime2CompleteTripsTest {

    static Stream<Arguments> provideArgument() {
        return Stream.of(
            Arguments.of(new int[]{1, 2, 3}, 5, 3),
            Arguments.of(new int[]{2}, 1, 2),
            Arguments.of(new int[]{1, 1, 7}, 5, 3),
            Arguments.of(new int[]{7}, 5, 35)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test(int[] time, int totalTrips, int expected) {
        Assertions.assertEquals(expected, new Solution1().minimumTime(time, totalTrips));
    }
}
