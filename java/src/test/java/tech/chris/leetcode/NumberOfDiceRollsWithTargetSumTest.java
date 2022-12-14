package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NumberOfDiceRollsWithTargetSumTest {

    @ParameterizedTest
    @CsvSource({"1,6,3,1", "2,6,7,6", "30,30,500,222616187"})
    public void test (int n, int k, int targetSum, int expected) {
        Assertions.assertEquals(expected, new NumberOfDiceRollsWithTargetSum().numRollsToTarget(n, k, targetSum));
    }
}
