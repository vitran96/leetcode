package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.stringCompression.Solution1;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringCompressionTest {

    static Stream<Arguments> provideArgument() {
        return Stream.of(
            Arguments.of(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'},
                         6,
                         new char[]{'a', '2', 'b', '2', 'c', '3'}),
            Arguments.of(new char[]{'a'}, 1, new char[]{'a'}),
            Arguments.of(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'},
                         4, new char[]{'a', 'b', '1', '2'})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test(char[] input, int expectedLength, char[] expectedArray) {
        int newLength = new Solution1().compress(input);
        char[] newArray = Arrays.copyOf(input, newLength);
        Assertions.assertEquals(expectedLength, newLength);
        Assertions.assertArrayEquals(expectedArray, newArray);
    }
}
