package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ExcelSheetColumnTitleTest {

    @ParameterizedTest
    @CsvSource({"1,A", "28,AB", "701,ZY"})
    public void test (int input, String expected) {
        Assertions.assertEquals(expected, new ExcelSheetColumnTitle().convertToTitle(input));
    }
}
