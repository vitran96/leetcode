package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StrStrTest {

    @ParameterizedTest
    @CsvSource({"hello,ll,2", "aaaaa,bba,-1", "asd,'',0"})
    public void test (String input1, String input2, int expected) {
        Assertions.assertEquals(expected, new StrStr().strStr(input1, input2));
    }
}
