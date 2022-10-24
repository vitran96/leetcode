package tech.chris.leetcode.removeLinkedListElements;

import tech.chris.leetcode.ListNode;

public class MySolution implements RemoveLinkedListElements {
    @Override
    public ListNode removeElements (ListNode head, int val) {
        ListNode newHead = null;
        ListNode current = null;
        while (head != null) {
            if (head.val != val) {
                if (newHead == null) {
                    newHead = new ListNode(head.val);
                    current = newHead;
                } else {
                    current.next = new ListNode(head.val);
                    current = current.next;
                }
            }

            head = head.next;
        }

        return newHead;
    }
}
