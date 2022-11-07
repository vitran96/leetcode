package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.max69Num.MySolution1;

import java.util.stream.Stream;

public class Max69NumTest {
    static Stream<Arguments> provideArgument () {
        return Stream.of(Arguments.of(9669, 9969),
                         Arguments.of(9996, 9999),
                         Arguments.of(9999, 9999)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test1 (int num, int expected) {
        Assertions.assertEquals(expected, new MySolution1().maximum69Number(num));
    }
}
