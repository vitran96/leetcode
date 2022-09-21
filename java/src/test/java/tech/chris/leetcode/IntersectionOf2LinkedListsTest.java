package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class IntersectionOf2LinkedListsTest {
    static Stream<Arguments> provideArgument () {
        return Stream.of(new IntersectedLinkedListConverter(8, new int[]{4, 1, 8, 4, 5}, new int[]{5, 6, 1, 8, 4, 5}, 2,
                                                            3).convert(),
                         new IntersectedLinkedListConverter(2, new int[]{1, 9, 1, 2, 4}, new int[]{3, 2, 4}, 3,
                                                            1).convert(),
                         new IntersectedLinkedListConverter(0, new int[]{2, 6, 4}, new int[]{1, 5}, 3, 2).convert());
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test (ListNode headA, ListNode headB, ListNode expected) {
        Assertions.assertEquals(expected, new IntersectionOf2LinkedLists().getIntersectionNode(headA, headB));
    }
}
