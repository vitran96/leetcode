package tech.chris.leetcode.serializeAndDeserializeBinTree;

import tech.chris.leetcode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution1 implements Codec {
    private static TreeNode makeTreeNode(final String[] strings, final int index) {
        if (index >= strings.length) {
            return null;
        }

        return str2TreeNode(strings[index]);
    }

    private static TreeNode str2TreeNode(final String s) {
        if (s == null || s.equals("null")) {
            return null;
        }

        return new TreeNode(Integer.parseInt(s));
    }

    @Override
    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(root.val);

        final Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while (queue.size() > 0) {
            TreeNode node = queue.poll();
            if (node == null) {
                stringBuilder.append(",null");
            } else {
                stringBuilder.append("," + node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public TreeNode deserialize(String data) {
        if (data.length() == 0) {
            return null;
        }

        final String[] strings = data.split(",");
        int n = 0;
        if (strings.length == 0 || strings[n].equals("null")) {
            return null;
        }

        final TreeNode root = makeTreeNode(strings, n);
        final Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() != 0) {
            TreeNode current = queue.poll();
            if (current == null) {
                continue;
            }
            current.left = makeTreeNode(strings, 2 * n + 1);
            queue.add(current.left);
            current.right = makeTreeNode(strings, 2 * n + 2);
            queue.add(current.right);
            n++;
        }

        return root;
    }
}
