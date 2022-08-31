package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SqrtXTest {

    @ParameterizedTest
    @CsvSource({"4,2", "8,2", "0,0", "1,1", "9,3", "10,3", "99,9", "2,1", "3,1", "2147395600,46340"})
    public void test (int input, int expected) {
        Assertions.assertEquals(expected, new SqrtX().mySqrt(input));
    }
}
