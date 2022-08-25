package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

public class RemoveDupFromSortedListTest {

    @ParameterizedTest
    @CsvSource({"'1,1,2',2,'1,2'", "'0,0,1,1,1,2,2,3,3,4',5,'0,1,2,3,4'"})
    public void test (@ConvertWith(IntArrayConverter.class) int[] input, int expected1,
                      @ConvertWith(IntArrayConverter.class) int[] expected2) {
        Assertions.assertEquals(expected1, new RemoveDupFromSortedList().removeDuplicates(input));
        Assertions.assertArrayEquals(expected2, Arrays.stream(input).limit(expected1).toArray());
    }
}
