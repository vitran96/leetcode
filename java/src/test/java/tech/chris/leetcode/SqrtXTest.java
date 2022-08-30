package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SqrtXTest {

    @ParameterizedTest
    @CsvSource({"4,2", "8,2"})
    public void test (int input, int expected) {
        Assertions.assertEquals(expected, new SqrtX().mySqrt(input));
    }
}
