package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.makeTheStringGreat.MySolution;

import java.util.stream.Stream;

public class MakeTheStringGreatTest {

    static Stream<Arguments> provideArgument () {
        return Stream.of(
            Arguments.of("leEeetcode", "leetcode"),
            Arguments.of("abBAcC", ""),
            Arguments.of("s", "s")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test (String s, String expected) {
        Assertions.assertEquals(expected, new MySolution().makeGood(s));
    }
}
