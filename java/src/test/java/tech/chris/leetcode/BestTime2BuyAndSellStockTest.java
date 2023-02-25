package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.bestTime2BuyAndSellStock.Solution1;

import java.util.stream.Stream;

public class BestTime2BuyAndSellStockTest {

    static Stream<Arguments> provideArgument() {
        return Stream.of(
            Arguments.of(new int[]{7, 1, 5, 3, 6, 4}, 5),
            Arguments.of(new int[]{7, 6, 4, 3, 1}, 0),
            Arguments.of(new int[]{2, 4, 1}, 2),
            Arguments.of(new int[]{2, 4, 1, 5}, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test(int[] input, int expected) {
        Assertions.assertEquals(expected, new Solution1().maxProfit(input));
    }
}
