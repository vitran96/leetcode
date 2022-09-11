package tech.chris.leetcode;

// Given the root of a binary tree, return its maximum depth.
// A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
// The number of nodes in the tree is in the range [0, 10^4].
// -100 <= Node.val <= 100
public class MaxDepthOfBinaryTree {
    // TODO: optimize space usage with tail recursion
    public int maxDepth (TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
