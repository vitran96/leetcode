package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ExcelSheetColumnNumberTest {
    static Stream<Arguments> provideArgument () {
        return Stream.of(Arguments.of("A", 1), Arguments.of("AB", 28), Arguments.of("ZY", 701), Arguments.of("AA", 27),
                         Arguments.of("ZZZ", 18278), Arguments.of("AAK", 713));
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test1 (String input, int expected) {
        Assertions.assertEquals(expected,
                                new tech.chris.leetcode.excelSheetColumnNumber.MySolution().titleToNumber(input));
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test2 (String input, int expected) {
        Assertions.assertEquals(expected,
                                new tech.chris.leetcode.excelSheetColumnNumber.OptimizedSolution().titleToNumber(
                                    input));
    }
}
