package tech.chris.leetcode.naryTreePreorderTraversal;

import tech.chris.leetcode.naryTreeNode.Node;

import java.util.List;

/**
 * Given the root of an n-ary tree, return the preorder traversal of its nodes' values.
 * Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)
 * <p>
 * Constraints:
 * <ul>
 *     <li>The number of nodes in the tree is in the range [0, 10^4].</li>
 *     <li>0 <= Node.val <= 10^4</li>
 *     <li>The height of the n-ary tree is less than or equal to 1000.</li>
 * </ul>
 */
public interface NaryTreePreorderTraversal {
    List<Integer> preorder(Node root);
}
