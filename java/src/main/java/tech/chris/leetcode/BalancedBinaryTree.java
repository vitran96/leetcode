package tech.chris.leetcode;

//Given a binary tree,determine if it is height-balanced.
//For this problem,a height-balanced binary tree is defined as:
//    a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
//
//
// The number of nodes in the tree is in the range [0,5000].
// -104 <= Node.val <= 104
public class BalancedBinaryTree {
    private static int treeNodeHeight (final TreeNode node, final int height) {
        if (node == null) {
            return height;
        }

        final int newHeight = height + 1;
        int leftHeight = treeNodeHeight(node.left, newHeight);
        int rightHeight = treeNodeHeight(node.right, newHeight);

        return Math.max(leftHeight, rightHeight);
    }

    public boolean isBalanced (TreeNode root) {
        if (root == null) {
            return true;
        }

        int leftHeight = treeNodeHeight(root.left, 0);
        int rightHeight = treeNodeHeight(root.right, 0);

        return Math.abs(leftHeight - rightHeight) <= 1;
    }
}
