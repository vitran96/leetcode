package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AddBinaryTest {

    @ParameterizedTest
    @CsvSource({"11,1,100", "1010,1011,10101"})
    public void test (String input1, String input2, String expected) {
        Assertions.assertEquals(expected, new AddBinary().addBinary(input1, input2));
    }
}
