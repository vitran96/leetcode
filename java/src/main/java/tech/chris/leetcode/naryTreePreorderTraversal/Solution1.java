package tech.chris.leetcode.naryTreePreorderTraversal;

import tech.chris.leetcode.naryTreeNode.Node;

import java.util.LinkedList;
import java.util.List;

public class Solution1 implements NaryTreePreorderTraversal {
    @Override
    public List<Integer> preorder(Node root) {
        List<Integer> list = new LinkedList<>();
        preorder(root, list);
        return list;
    }

    void preorder(Node current, List<Integer> values) {
        if (current == null) {
            return;
        }

        values.add(current.val);
        if (current.children == null) {
            return;
        }

        for (Node child : current.children) {
            preorder(child, values);
        }
    }
}
