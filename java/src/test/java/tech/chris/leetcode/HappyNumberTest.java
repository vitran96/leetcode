package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.happyNumber.MySolution;

import java.util.stream.Stream;

public class HappyNumberTest {

    static Stream<Arguments> provideArgument () {
        return Stream.of(Arguments.of(19, true), Arguments.of(2, false));
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test (int n, boolean expected) {
        Assertions.assertEquals(expected, new MySolution().isHappy(n));
    }
}
