package tech.chris.leetcode;

// Given a binary tree,find its minimum depth.
// The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
// Note:A leaf is a node with no children.
//
//
// The number of nodes in the tree is in the range [0, 105].
// -1000 <= Node.val <= 1000
public class MinDepthOfBinaryTree {
    public int minDepth (TreeNode root) {
        if (root == null) {
            return 0;
        }

        final int leftHeight = minDepth(root.left);
        final int rightHeight = minDepth(root.right);

        if (leftHeight == 0 || rightHeight == 0) {
            return 1 + Math.max(leftHeight, rightHeight);
        }

        return 1 + Math.min(leftHeight, rightHeight);
    }
}
