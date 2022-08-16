package tech.chris.leetcode;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ReverseIntTest {

    @ParameterizedTest
    @CsvSource({"123,321", "-123,-321", "120,21"})
    public void test(int input, int expected) {
        Assertions.assertEquals(expected, ReverseInt.solution(input));
    }
}
