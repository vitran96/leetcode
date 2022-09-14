package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PascalsTriangle2Test {

    @ParameterizedTest
    @CsvSource({"3,'[1, 3, 3, 1]'", "0,'[1]'", "1,'[1, 1]'"})
    public void test (int rowIndex, String expected) {
        Assertions.assertEquals(expected, (new PascalsTriangle2().getRow(rowIndex)).toString());
    }
}
