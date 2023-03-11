package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.reverseLinkedList.Solution1;

import java.util.stream.Stream;

public class ReverseLinkedListTest {

    static Stream<Arguments> provideArgument() {
        return Stream.of(
            Arguments.of(new ListNodeConverter().convert("1,2", ListNode.class),
                         new ListNodeConverter().convert("2,1", ListNode.class)),
            Arguments.of(new ListNodeConverter().convert("1,2,3,4,5", ListNode.class),
                         new ListNodeConverter().convert("5,4,3,2,1", ListNode.class)),
            Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test1(ListNode input, ListNode expected) {
        Assertions.assertEquals(expected, new Solution1().reverseList(input));
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test2(ListNode input, ListNode expected) {
        Assertions.assertEquals(expected, new Solution1().reverseList(input));
    }
}
