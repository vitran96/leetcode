package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

public class MergeSortedArrayTest {

    @ParameterizedTest
    @CsvSource({"'1,2,3,0,0,0',3,'2,5,6',3,'1,2,2,3,5,6'", "'1',1,'',0,'1'", "'0',0,'1',1,'1'"})
    public void test (@ConvertWith(IntArrayConverter.class) int[] nums1,
                      int m,
                      @ConvertWith(IntArrayConverter.class) int[] nums2,
                      int n,
                      @ConvertWith(IntArrayConverter.class) int[] expected) {
        new MergeSortedArray().merge(nums1, m, nums2, n);
        Assertions.assertArrayEquals(expected, nums1);
    }
}
