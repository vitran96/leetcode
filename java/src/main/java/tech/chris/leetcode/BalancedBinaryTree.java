package tech.chris.leetcode;

import javafx.util.Pair;

//Given a binary tree,determine if it is height-balanced.
//For this problem,a height-balanced binary tree is defined as:
//    a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
//
//
// The number of nodes in the tree is in the range [0,5000].
// -104 <= Node.val <= 104
public class BalancedBinaryTree {

    // TODO: space optimization can be done by not using pair
    private static Pair<Integer, Boolean> isBalanced (final TreeNode node, int height) {
        if (node == null) {
            return new Pair<>(height, true);
        }

        height++;
        final Pair<Integer, Boolean> leftResult = isBalanced(node.left, height);
        final Pair<Integer, Boolean> rightResult = isBalanced(node.right, height);

        if (!leftResult.getValue() || !rightResult.getValue()) {
            return new Pair<>(-1, false);
        } else if (Math.abs(leftResult.getKey() - rightResult.getKey()) > 1) {
            return new Pair<>(-1, false);
        }

        return new Pair<>(Math.max(leftResult.getKey(), rightResult.getKey()), true);
    }

    public boolean isBalanced (TreeNode root) {
        return isBalanced(root, 0).getValue();
    }
}
