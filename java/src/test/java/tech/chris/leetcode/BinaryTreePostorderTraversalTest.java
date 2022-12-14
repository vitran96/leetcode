package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

public class BinaryTreePostorderTraversalTest {

    @ParameterizedTest
    @CsvSource({"'1,null,2,3','3,2,1'", "'',''", "'1','1'", "'3,1,2','1,2,3'"})
    public void test (@ConvertWith(TreeNodeConverter.class) TreeNode input,
                      @ConvertWith(ListIntegerConverter.class) List<Integer> expected) {
        Assertions.assertEquals(expected, new BinaryTreePostorderTraversal().postorderTraversal(input));
    }
}
