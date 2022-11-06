package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.orderlyQueue.MySolution;

import java.util.stream.Stream;

public class OrderlyQueueTest {

    static Stream<Arguments> provideArgument () {
        return Stream.of(Arguments.of("cba", 1, "acb"), Arguments.of("baaca", 3, "aaabc"));
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test1 (String s, int k, String expected) {
        Assertions.assertEquals(expected, new MySolution().orderlyQueue(s, k));
    }
}
