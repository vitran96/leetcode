package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

public class BalancedBinaryTreeTest {

    @ParameterizedTest
    @CsvSource({"'3,9,20,null,null,15,7',true", "'1,2,2,3,3,null,null,4,4',false", "'',true",
                "'1,2,2,3,null,null,3,4,null,null,4',false"})
    public void test (@ConvertWith(TreeNodeConverter.class) TreeNode input, boolean expected) {
        Assertions.assertEquals(expected, new BalancedBinaryTree().isBalanced(input));
    }
}
