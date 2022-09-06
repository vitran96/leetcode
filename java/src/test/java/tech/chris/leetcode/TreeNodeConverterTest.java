package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Objects;

public class TreeNodeConverterTest {

    @ParameterizedTest
    @CsvSource({"'1,2,3','1 {2 {null, null}, 3 {null, null}}'",
                "'1,null,2,null,3,4','1 {null, 2 {null, 3 {4 {null, null}, null}}}'",
                "'1,null,2,3','1 {null, 2 {3 {null, null}, null}}'"})
    public void test (String input, String expected) {
        Assertions.assertEquals(expected, (Objects.requireNonNull(
            new TreeNodeConverter().convert(input, TreeNode.class))).toString());
    }
}
