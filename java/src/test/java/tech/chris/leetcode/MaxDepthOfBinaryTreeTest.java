package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

public class MaxDepthOfBinaryTreeTest {

    @ParameterizedTest
    @CsvSource({"'3,9,20,null,null,15,7',3", "'1,null,2',2"})
    public void test (@ConvertWith(TreeNodeConverter.class) TreeNode input, int expected) {
        Assertions.assertEquals(expected, new MaxDepthOfBinaryTree().maxDepth(input));
    }
}
