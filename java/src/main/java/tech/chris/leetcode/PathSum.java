package tech.chris.leetcode;

// Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that
// adding up all the values along the path equals targetSum.
// A leaf is a node with no children.
//
// The number of nodes in the tree is in the range [0,5000].
// -1000 <= Node.val <= 1000
// -1000 <= targetSum <= 1000
public class PathSum {
    private static boolean hasPathSum (final TreeNode root, final int targetSum, int currentSum) {
        if (root == null) {
            return false;
        }

        currentSum += root.val;
        if (root.left == null && root.right == null) {
            return currentSum == targetSum;
        }

        return hasPathSum(root.left, targetSum, currentSum) || hasPathSum(root.right, targetSum, currentSum);
    }

    // TODO: space usage can be decrease by using only 1 function
    public boolean hasPathSum (TreeNode root, int targetSum) {
        return hasPathSum(root, targetSum, 0);
    }
}
