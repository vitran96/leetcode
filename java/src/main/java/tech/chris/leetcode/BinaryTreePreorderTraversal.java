package tech.chris.leetcode;

import java.util.LinkedList;
import java.util.List;

// Given the root of a binary tree, return the preorder traversal of its nodes' values.
//
// The number of nodes in the tree is in the range [0, 100].
// -100 <= Node.val <= 100
public class BinaryTreePreorderTraversal {
    private void preorderTraversal (TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        result.add(root.val);
        preorderTraversal(root.left, result);
        preorderTraversal(root.right, result);
    }

    public List<Integer> preorderTraversal (TreeNode root) {
        List<Integer> result = new LinkedList<>();
        preorderTraversal(root, result);
        return result;
    }
}
