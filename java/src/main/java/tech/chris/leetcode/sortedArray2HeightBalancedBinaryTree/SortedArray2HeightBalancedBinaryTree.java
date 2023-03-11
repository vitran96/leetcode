package tech.chris.leetcode.sortedArray2HeightBalancedBinaryTree;

import tech.chris.leetcode.ListNode;
import tech.chris.leetcode.TreeNode;

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
public interface SortedArray2HeightBalancedBinaryTree {
    TreeNode sortedListToBST(ListNode head);
}
