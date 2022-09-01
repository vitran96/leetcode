package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class LengthOfTheLastWordTest {

    @ParameterizedTest
    @CsvSource({"Hello World,5", "'   fly me   to   the moon  ',4", "luffy is still joyboy,6"})
    public void test (String input, int expected) {
        Assertions.assertEquals(expected, new LengthOfTheLastWord().lengthOfTheLastWord(input));
    }
}
