package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

public class BinaryTreeInorderTraversalTest {

    @ParameterizedTest
    @CsvSource({"'1,null,2,3','1,3,2'", "'',''", "'1','1'"})
    public void test (@ConvertWith(TreeNodeConverter.class) TreeNode input,
                      @ConvertWith(ListIntegerConverter.class) List<Integer> expected) {
        Assertions.assertEquals(expected, new BinaryTreeInorderTraversal().inorderTraversal(input));
    }
}
