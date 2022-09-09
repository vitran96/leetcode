package tech.chris.leetcode;

//Given the root of a binary tree,check whether it is a mirror of itself(i.e.,symmetric around its center).

// The number of nodes in the tree is in the range[1,1000].
// -100 <= Node.val <= 100
public class SymmetricTree {
    public boolean isSymmetric (TreeNode root) {
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric (TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        }

        return left.val == right.val && isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
