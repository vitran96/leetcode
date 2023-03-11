package tech.chris.leetcode.middleOfTheLinkedList;

import tech.chris.leetcode.ListNode;

public class Solution2 implements MiddleOfTheLinkedList {
    @Override
    public ListNode middleNode(ListNode head) {
        ListNode middle = head;
        ListNode ptr = head;
        int size = 0;
        while (ptr != null) {
            ptr = ptr.next;
            size++;
            // Size is a EVEN number then move middle pointer by 1
            if (size % 2 == 0) {
                middle = middle.next;
            }
        }

        return middle;
    }
}
