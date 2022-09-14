package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PascalsTriangleTest {

    @ParameterizedTest
    @CsvSource({"5,'[[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]'", "1,'[[1]]'"})
    public void test (int numRows, String expected) {
        Assertions.assertEquals(expected, (new PascalsTriangle().generate(numRows)).toString());
    }
}
