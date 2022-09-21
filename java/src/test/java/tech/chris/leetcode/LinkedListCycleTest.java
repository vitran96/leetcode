package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class LinkedListCycleTest {

    static Stream<Arguments> provideArgument () {
        return Stream.of(Arguments.of(ListNodeConverter.convert("3,2,0,-4", 1), true),
                         Arguments.of(ListNodeConverter.convert("1,2", 0), true),
                         Arguments.of(ListNodeConverter.convert("1", -1), false));
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test (ListNode head, boolean expected) {
        Assertions.assertEquals(expected, new LinkedListCycle().hasCycle(head));
    }
}
