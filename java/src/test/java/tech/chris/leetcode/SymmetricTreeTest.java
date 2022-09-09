package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

public class SymmetricTreeTest {

    @ParameterizedTest
    @CsvSource({"'1,2,2,3,4,4,3',true", "'1,2,2,null,3,null,3',false", "'1,2,3',false", "'1',true"})
    public void test (@ConvertWith(TreeNodeConverter.class) TreeNode input, boolean expected) {
        Assertions.assertEquals(expected, new SymmetricTree().isSymmetric(input));
    }
}
