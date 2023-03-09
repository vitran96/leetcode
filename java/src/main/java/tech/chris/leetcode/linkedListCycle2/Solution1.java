package tech.chris.leetcode.linkedListCycle2;

import tech.chris.leetcode.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution1 implements LinkedListCycle2 {
    @Override
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode current = head;
        while (current != null) {
            if (!set.add(current)) {
                break;
            }

            current = current.next;
        }
        return current;
    }
}
