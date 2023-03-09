package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.linkedListCycle2.Solution1;
import tech.chris.leetcode.linkedListCycle2.Solution2;

import java.util.stream.Stream;

public class LinkedListCycle2Test {

    private static Arguments makeArgument(final String source, final int loopPos) {
        ListNode head = (ListNode) ListNodeConverter.convert(source, loopPos);
        ListNode expected = null;
        if (loopPos >= 0) {
            for (int i = 0; i <= loopPos; i++) {
                if (expected == null) {
                    expected = head;
                    continue;
                }

                expected = expected.next;
            }
        }

        return Arguments.of(head, expected);
    }

    static Stream<Arguments> provideArgument() {
        return Stream.of(makeArgument("3,2,0,-4", 1),
                         makeArgument("1,2", 0),
                         makeArgument("1", -1));
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test1(ListNode head, ListNode expected) {
        Assertions.assertSame(expected, new Solution1().detectCycle(head));
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test2(ListNode head, ListNode expected) {
        Assertions.assertSame(expected, new Solution2().detectCycle(head));
    }
}
