package tech.chris.leetcode.middleOfTheLinkedList;

import tech.chris.leetcode.ListNode;

/**
 * Given the head of a singly linked list, return the middle node of the linked list.
 * If there are two middle nodes, return the second middle node.
 * <p>
 * Constraints:
 * <ul>
 *     <li>The number of nodes in the list is in the range [1, 100].</li>
 *     <li>1 <= Node.val <= 100</li>
 * </ul>
 */
public interface MiddleOfTheLinkedList {
    ListNode middleNode(ListNode head);
}
