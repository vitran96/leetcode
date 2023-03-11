package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.middleOfTheLinkedList.Solution1;

import java.util.stream.Stream;

public class MiddleOfTheLinkedListTest {

    private static Arguments makeArgument(final String source, int middleNodeIndex) {
        ListNode head = (ListNode) ListNodeConverter.convert(source, -1);
        ListNode current = head;
        while (middleNodeIndex != 0) {
            current = current.next;
            middleNodeIndex--;
        }

        return Arguments.of(head, current);
    }

    static Stream<Arguments> provideArgument() {
        return Stream.of(makeArgument("1,2,3,4,5", 2),
                         makeArgument("1,2,3,4,5,6", 3),
                         Arguments.of(null, null));
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test1(ListNode head, ListNode expected) {
        Assertions.assertSame(expected, new Solution1().middleNode(head));
    }
}
