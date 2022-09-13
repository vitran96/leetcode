package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

public class PathSumTest {

    @ParameterizedTest
    @CsvSource({"'5,4,8,11,null,13,4,7,2,null,null,null,1',22,true", "'1,2,3',5,false", "'',0,false",
                "'1,2,3,4',3,false", "'1,-2,-3,1,3,-2,null,-1',-1,true"})
    public void test (@ConvertWith(TreeNodeConverter.class) TreeNode root, int targetSum, boolean expected) {
        Assertions.assertEquals(expected, new PathSum().hasPathSum(root, targetSum));
    }
}
