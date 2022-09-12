package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

public class SortedArray2BinarySearchTreeTest {

    @ParameterizedTest
    @CsvSource({"'-10,-3,0,5,9','0,-3,9,-10,null,5'", "'1,3','3,1'"})
    public void test (@ConvertWith(IntArrayConverter.class) int[] input,
                      @ConvertWith(TreeNodeConverter.class) TreeNode expected) {
        Assertions.assertEquals(expected, new SortedArray2BinarySearchTree().sortedArrayToBST(input));
    }
}
