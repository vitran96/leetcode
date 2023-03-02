package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.sortAnArray.Solution1;

import java.util.stream.Stream;

public class SortAnArrayTest {

    static Stream<Arguments> provideArgument() {
        return Stream.of(
            Arguments.of(new int[]{5, 2, 3, 1}, new int[]{1, 2, 3, 5}),
            Arguments.of(new int[]{5, 1, 1, 2, 0, 0}, new int[]{0, 0, 1, 1, 2, 5})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test(int[] input, int[] expected) {
        Assertions.assertArrayEquals(expected, new Solution1().sortArray(input));
    }
}
