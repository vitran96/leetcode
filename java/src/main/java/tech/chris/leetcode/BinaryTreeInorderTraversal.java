package tech.chris.leetcode;

import java.util.LinkedList;
import java.util.List;

// Given the root of a binary tree, return the inorder traversal of its nodes' values.
//
//
// The number of nodes in the tree is in the range [0,100].
// -100 <= Node.val <= 100
public class BinaryTreeInorderTraversal {
    private static void inorderTraversal (TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        inorderTraversal(node.left, result);
        result.add(node.val);
        inorderTraversal(node.right, result);
    }

    public List<Integer> inorderTraversal (TreeNode root) {
        List<Integer> result = new LinkedList<>();
        if (root == null) {
            return result;
        }

        inorderTraversal(root.left, result);
        result.add(root.val);
        inorderTraversal(root.right, result);

        return result;
    }
}
