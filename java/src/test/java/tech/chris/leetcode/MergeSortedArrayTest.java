package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

public class MergeSortedArrayTest {

    @ParameterizedTest
    @CsvSource({""})
    public void test (@ConvertWith(IntArrayConverter.class) int[] input1,
                      @ConvertWith(IntArrayConverter.class) int[] input2,
                      int input3,
                      @ConvertWith(IntArrayConverter.class) int[] expected) {
        new MergeSortedArray().merge(input1, input2, input3);
        Assertions.assertArrayEquals(expected, input1);
    }
}
