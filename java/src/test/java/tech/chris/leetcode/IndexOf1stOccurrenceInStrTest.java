package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.indexOf1stOccurrenceInStr.Solution1;

import java.util.stream.Stream;

public class IndexOf1stOccurrenceInStrTest {

    static Stream<Arguments> provideArgument() {
        return Stream.of(
            Arguments.of("sadbutsad", "sad"),
            Arguments.of("leetcode", "leeto")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test(String haystack, String needle, int expected) {
        Assertions.assertEquals(expected, new Solution1().strStr(haystack, needle));
    }
}
