package tech.chris.leetcode;

import java.util.ArrayList;
import java.util.List;

// Given the root of a binary tree, return the postorder traversal of its nodes' values.
//
// The number of nodes in the tree is in the range [0, 100].
// -100 <= Node.val <= 100
public class BinaryTreePostorderTraversal {
    private void postorderTraversal (TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        postorderTraversal(node.right, result);
        postorderTraversal(node.left, result);
        result.add(node.val);
    }

    public List<Integer> postorderTraversal (TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderTraversal(root, result);
        return result;
    }
}
