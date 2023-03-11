package tech.chris.leetcode.middleOfTheLinkedList;

import tech.chris.leetcode.ListNode;

public class Solution1 implements MiddleOfTheLinkedList {
    @Override
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode ptr = head;
        while (ptr != null) {
            ptr = ptr.next;
            size++;
        }

        ptr = head;
        int mid = size / 2;
        while (mid != 0) {
            ptr = ptr.next;
            mid--;
        }

        return ptr;
    }
}
