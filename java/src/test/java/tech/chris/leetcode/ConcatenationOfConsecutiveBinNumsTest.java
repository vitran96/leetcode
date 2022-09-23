package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ConcatenationOfConsecutiveBinNumsTest {

    @ParameterizedTest
    @CsvSource({"1,1", "3,27", "12,505379714"})
    public void test (int input1, int expected) {
        Assertions.assertEquals(expected, new ConcatenationOfConsecutiveBinNums().concatenatedBinary(input1));
    }
}
