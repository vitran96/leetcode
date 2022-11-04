package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.reverseVowelsOfString.MySolution;

import java.util.stream.Stream;

public class ReverseVowelsOfStringTest {
    static Stream<Arguments> provideArgument () {
        return Stream.of(
            Arguments.of("hello", "holle"),
            Arguments.of("leetcode", "leotcede"),
            Arguments.of("choose", "cheoso"),
            Arguments.of("boy", "boy"),
            Arguments.of("meat", "maet"),
            Arguments.of("place", "pleca"),
            Arguments.of("receive", "recieve"),
            Arguments.of("ceiling", "ciileng"),
            Arguments.of("weight", "wieght")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test1 (String input, String expected) {
        Assertions.assertEquals(expected, new MySolution().reverseVowels(input));
    }
}
