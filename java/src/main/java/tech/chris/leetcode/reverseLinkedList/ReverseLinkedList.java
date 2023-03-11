package tech.chris.leetcode.reverseLinkedList;

import tech.chris.leetcode.ListNode;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * Constraints:
 * <ul>
 *   <li>The number of nodes in the list is the range [0, 5000].</li>
 *   <li>-5000 <= Node.val <= 5000</li>
 * </ul>
 * <p>
 * Follow up: A linked list can be reversed either iteratively or recursively. Could you implemen
 */
public interface ReverseLinkedList {
    ListNode reverseList(ListNode head);
}
