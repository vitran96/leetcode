package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DecodeWaysTest {

    @ParameterizedTest
    @CsvSource({"12,2", "226,3", "06,0", "27,1", "11106,2", "11306,0", "11116,8", "123456,3", "111111,13",
                "123700532,0","125100135,0"})
    public void test (String input, int expected) {
        Assertions.assertEquals(expected, new DecodeWays().numDecodings(input));
    }
}
