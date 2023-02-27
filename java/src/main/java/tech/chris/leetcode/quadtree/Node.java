package tech.chris.leetcode.quadtree;

import java.util.Objects;

// Definition for a QuadTree node.
public class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public Node(boolean val,
                boolean isLeaf,
                Node topLeft,
                Node topRight,
                Node bottomLeft,
                Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public String toString() {
        return "Node{" +
            "val=" + val +
            ", isLeaf=" + isLeaf +
            ", topLeft=" + topLeft +
            ", topRight=" + topRight +
            ", bottomLeft=" + bottomLeft +
            ", bottomRight=" + bottomRight +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        if (val != node.val) return false;
        if (isLeaf != node.isLeaf) return false;
        if (!Objects.equals(topLeft, node.topLeft)) return false;
        if (!Objects.equals(topRight, node.topRight))
            return false;
        if (!Objects.equals(bottomLeft, node.bottomLeft))
            return false;
        return Objects.equals(bottomRight, node.bottomRight);
    }

    @Override
    public int hashCode() {
        int result = (val ? 1 : 0);
        result = 31 * result + (isLeaf ? 1 : 0);
        result = 31 * result + (topLeft != null ? topLeft.hashCode() : 0);
        result = 31 * result + (topRight != null ? topRight.hashCode() : 0);
        result = 31 * result + (bottomLeft != null ? bottomLeft.hashCode() : 0);
        result = 31 * result + (bottomRight != null ? bottomRight.hashCode() : 0);
        return result;
    }
}
