package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.kokoEatBananas.Solution1;

import java.util.stream.Stream;

public class KokoEatBananasTest {

    static Stream<Arguments> provideArgument() {
        return Stream.of(
            Arguments.of(new int[]{3, 6, 7, 11}, 8, 4),
            Arguments.of(new int[]{30, 11, 23, 4, 20}, 5, 30),
            Arguments.of(new int[]{30, 11, 23, 4, 20}, 6, 23)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test(int[] piles, int h, int expected) {
        Assertions.assertEquals(expected, new Solution1().minEatingSpeed(piles, h));
    }
}
