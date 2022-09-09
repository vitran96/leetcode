package tech.chris.leetcode;

import java.util.Objects;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode (int val) {
        this.val = val;
    }

    public TreeNode (int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString () {
        if (left == null && right == null) {
            return String.valueOf(val);
        }

        String leftV = left == null ? "null" : left.toString();
        String rightV = right == null ? "null" : right.toString();

        return val + " {" + leftV + ", " + rightV + "}";
    }

    @Override
    public boolean equals (Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        TreeNode treeNode = (TreeNode) o;

        if (val != treeNode.val)
            return false;
        if (!Objects.equals(left, treeNode.left))
            return false;
        return Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode () {
        int result = val;
        result = 31 * result + (left != null ? left.hashCode() : 0);
        result = 31 * result + (right != null ? right.hashCode() : 0);
        return result;
    }
}
