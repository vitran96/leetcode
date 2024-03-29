package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.ipo.Solution1;

import java.util.stream.Stream;

public class IpoTest {

    static Stream<Arguments> provideArgument() {
        return Stream.of(
            Arguments.of(2, 0, new int[]{1, 2, 3}, new int[]{0, 1, 1}, 4),
            Arguments.of(3, 0, new int[]{1, 2, 3}, new int[]{0, 1, 2}, 6),
            Arguments.of(10, 0, new int[]{1, 2, 3}, new int[]{0, 1, 2}, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test1(int k, int w, int[] profits, int[] capital, int expected) {
        Assertions.assertEquals(expected, new Solution1().findMaximizedCapital(k, w, profits, capital));
    }
}
