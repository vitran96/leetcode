package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

public class BestTime2BuyAndSellStockTest {

    @ParameterizedTest
    @CsvSource({"'7,1,5,3,6,4',5", "'7,6,4,3,1',0"})
    public void test (@ConvertWith(IntArrayConverter.class) int[] input, int expected) {
        Assertions.assertEquals(expected, new BestTime2BuyAndSellStock().maxProfit(input));
    }
}
