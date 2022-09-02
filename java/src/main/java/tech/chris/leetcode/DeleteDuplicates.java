package tech.chris.leetcode;

import java.util.HashSet;
import java.util.Set;

// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
public class DeleteDuplicates {
    // TODO: can be optimize
    public ListNode deleteDuplicates (ListNode head) {
        Set<Integer> nums = new HashSet<>();
        ListNode newHead = null;
        ListNode current = null;

        while (head != null) {
            if (newHead == null) {
                newHead = new ListNode(head.val);
                current = newHead;
            } else if (!nums.contains(head.val)) {
                ListNode next = new ListNode(head.val);
                current.next = next;
                current = next;
            }

            nums.add(head.val);
            head = head.next;
        }

        return newHead;
    }
}
