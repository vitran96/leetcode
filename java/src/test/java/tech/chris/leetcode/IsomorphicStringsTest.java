package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.isomorphicStrings.MySolution;

import java.util.stream.Stream;

public class IsomorphicStringsTest {

    static Stream<Arguments> provideArgument () {
        return Stream.of(Arguments.of("egg", "add", true),
                         Arguments.of("foo", "bar", false),
                         Arguments.of("paper", "title", true),
                         Arguments.of("aaeaa", "uuxyy", false),
                         Arguments.of("13", "42", true),
                         Arguments.of("badc", "baba", false));
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test (String s, String t, boolean expected) {
        Assertions.assertEquals(expected, new MySolution().isIsomorphic(s, t));
    }
}
