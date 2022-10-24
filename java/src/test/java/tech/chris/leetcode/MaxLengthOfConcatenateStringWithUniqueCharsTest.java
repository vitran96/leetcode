package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MaxLengthOfConcatenateStringWithUniqueCharsTest {
    static Stream<Arguments> provideArgument () {
        return Stream.of(Arguments.of(new ArrayList<String>() {{
            add("un");
            add("iq");
            add("ue");
        }}, 4), Arguments.of(new ArrayList<String>() {{
            add("cha");
            add("r");
            add("act");
            add("ers");
        }}, 6), Arguments.of(new ArrayList<String>() {{
            add("abcdefghijklmnopqrstuvwxyz");
        }}, 26), Arguments.of(new ArrayList<String>() {{
            add("cha");
            add("act");
        }}, 3), Arguments.of(new ArrayList<String>() {{
            add("ccha");
            add("cact");
        }}, 0));
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test1 (List<String> input, int expected) {
        Assertions.assertEquals(expected,
                                new tech.chris.leetcode.maxLengthOfConcatenateStringWithUniqueChars.MySolution().maxLength(
                                    input));
    }
}
