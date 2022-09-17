package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

public class SingleNumberTest {

    @ParameterizedTest
    @CsvSource({"'2,2,1',1", "'4,1,2,1,2',4", "'1',1"})
    public void test (@ConvertWith(IntArrayConverter.class) int[] input, int expected) {
        Assertions.assertEquals(expected, new SingleNumber().singleNumber(input));
    }
}
