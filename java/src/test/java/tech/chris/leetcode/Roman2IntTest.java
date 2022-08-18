package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Roman2IntTest {

    @ParameterizedTest
    @CsvSource({","})
    public void test(String input, int expected) {
        Assertions.assertEquals(expected, Roman2Int.solution(input));
    }
}
