package tech.chris.leetcode.removeLinkedListElements;

import tech.chris.leetcode.ListNode;

/**
 * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
 * <p>
 * The number of nodes in the list is in the range [0, 10^4].
 * 1 <= Node.val <= 50
 * 0 <= val <= 50
 */
public interface RemoveLinkedListElements {
    ListNode removeElements (ListNode head, int val);
}
