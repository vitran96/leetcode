package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DecodeWaysTest {

    @ParameterizedTest
    @CsvSource({"12,2", "226,3", "06,0"})
    public void test (String input, int expected) {
        Assertions.assertEquals(expected, new DecodeWays().numDecodings(input));
    }
}
