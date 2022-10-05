package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ExcelSheetColumnNumberTest {

    @ParameterizedTest
    @CsvSource({"A,1", "AB,28", "ZY,701", "AA,27", "ZZZ,18278", "AAK,713"})
    public void test1 (String input, int expected) {
        Assertions.assertEquals(expected,
                                new tech.chris.leetcode.excelSheetColumnNumber.MySolution().titleToNumber(input));
    }

    @ParameterizedTest
    @CsvSource({"A,1", "AB,28", "ZY,701", "AA,27", "ZZZ,18278", "AAK,713"})
    public void test2 (String input, int expected) {
        Assertions.assertEquals(expected,
                                new tech.chris.leetcode.excelSheetColumnNumber.OptimizedSolution().titleToNumber(
                                    input));
    }
}
