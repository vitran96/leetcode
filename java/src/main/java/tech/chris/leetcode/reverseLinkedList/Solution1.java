package tech.chris.leetcode.reverseLinkedList;

import tech.chris.leetcode.ListNode;

public class Solution1 implements ReverseLinkedList {
    @Override
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode newHead = null;
        while (current != null) {
            newHead = new ListNode(current.val, newHead);
            current = current.next;
        }

        return newHead;
    }
}
