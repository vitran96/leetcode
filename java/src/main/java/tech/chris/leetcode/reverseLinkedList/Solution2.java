package tech.chris.leetcode.reverseLinkedList;

import tech.chris.leetcode.ListNode;

public class Solution2 implements ReverseLinkedList {
    @Override
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        return new ListNode(head.val, reverseList(head));
    }
}
