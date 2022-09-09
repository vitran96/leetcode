package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Objects;

public class TreeNodeConverterTest {

    @ParameterizedTest
    @CsvSource({"'1,2,3','1 {2, 3}'", "'1,null,2,null,3,4','1 {null, 2 {null, 3 {4, null}}}'",
                "'1,null,2,3','1 {null, 2 {3, null}}'", "'1,2,2,3,4,4,3','1 {2 {3, 4}, 2 {4, 3}}'",
                "'1,2,2,null,3,null,3', '1 {2 {null, 3}, 2 {null, 3}}'"})
    public void test (String input, String expected) {
        Assertions.assertEquals(expected, (Objects.requireNonNull(
            new TreeNodeConverter().convert(input, TreeNode.class))).toString());
    }
}
