package tech.chris.leetcode;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

import java.util.LinkedList;
import java.util.Queue;

public final class TreeNodeConverter extends SimpleArgumentConverter {

    private static TreeNode makeTreeNode (final String[] strings, final int index) {
        if (index >= strings.length) {
            return null;
        }

        return str2TreeNode(strings[index]);
    }

    private static TreeNode str2TreeNode (final String s) {
        if (s == null || s.equals("null")) {
            return null;
        }

        return new TreeNode(Integer.parseInt(s));
    }

    @Override
    protected Object convert (final Object source, final Class<?> targetType) throws ArgumentConversionException {
        if (source instanceof String && TreeNode.class.isAssignableFrom(targetType)) {
            if (((String) source).length() == 0) {
                return null;
            }

            final String[] strings = ((String) source).split(",");
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
        } else {
            throw new IllegalArgumentException(
                "Conversion from " + source.getClass() + " to " + targetType + " not supported.");
        }
    }

}
