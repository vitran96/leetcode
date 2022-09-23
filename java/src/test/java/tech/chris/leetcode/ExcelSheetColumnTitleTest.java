package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ExcelSheetColumnTitleTest {

    @ParameterizedTest
    @CsvSource({"1,A", "27,AA", "28,AB", "701,ZY", "702,ZZ", "703,AAA", "713,AAK", "18278,ZZZ", "18252,ZYZ"})
    public void test (int input, String expected) {
        Assertions.assertEquals(expected, new ExcelSheetColumnTitle().convertToTitle(input));
    }
}
