package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

public class PlusOneTest {

    @ParameterizedTest
    @CsvSource({"'1,2,3','1,2,4'", "'4,3,2,1','4,3,2,2'", "'9','1,0'"})
    public void test (@ConvertWith(IntArrayConverter.class) int[] input,
                      @ConvertWith(IntArrayConverter.class) int[] expected) {
        Assertions.assertArrayEquals(expected, new PlusOne().plusOne(input));
    }
}
