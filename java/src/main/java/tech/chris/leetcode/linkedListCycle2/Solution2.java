package tech.chris.leetcode.linkedListCycle2;

import tech.chris.leetcode.ListNode;

public class Solution2 implements LinkedListCycle2 {
    @Override
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode loopStartNode = head;
        ListNode tortoise = head;
        ListNode hare = head;
        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;

            if (tortoise == hare) {
                // I need to research why this work :((
                while (loopStartNode != hare) {
                    loopStartNode = loopStartNode.next;
                    hare = hare.next;
                }

                return loopStartNode;
            }

        }

        return null;
    }
}
