package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ClimbingStairsTest {

    @ParameterizedTest
    @CsvSource({"2,2", "3,3"})
    public void test (int input, int expected) {
        Assertions.assertEquals(expected, new ClimbingStairs().climbStairs(input));
    }
}
