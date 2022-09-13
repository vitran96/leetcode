package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

public class MinDepthOfBinaryTreeTest {

    @ParameterizedTest
    @CsvSource({"'3,9,20,null,null,15,7',2", "'2,null,3,null,4,null,5,null,6',5", "'2,1,3,null,4,null,5,null,6',3",
                "'',0"})
    public void test (@ConvertWith(TreeNodeConverter.class) TreeNode input, int expected) {
        Assertions.assertEquals(expected, new MinDepthOfBinaryTree().minDepth(input));
    }
}
