package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

public class SearchInsertTest {

    @ParameterizedTest
    @CsvSource({"'1,3,5,6',5,2", "'1,3,5,6',2,1", "'1,3,5,6',7,4", "'1,3,5,6',0,0", "'1,3',2,1"})
    public void test (@ConvertWith(IntArrayConverter.class) int[] input1,
                      int input2,
                      int expected) {
        Assertions.assertEquals(expected, new SearchInsert().searchInsert(input1, input2));
    }
}
