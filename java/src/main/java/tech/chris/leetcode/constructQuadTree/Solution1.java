package tech.chris.leetcode.constructQuadTree;

import tech.chris.leetcode.quadtree.Node;

public class Solution1 implements ConstructQuadTree {

    @Override
    public Node construct(int[][] grid) {
        return construct(grid, 0, 0);
    }


    private Node construct(int[][] grid, int nodeX, int nodeY) {
        Node current = new Node(grid[nodeY][nodeX] == 1, true);
        int x = nodeX + 1;
        int y = nodeY + 1;
        if (x >= grid.length || y >= grid.length) {
            return current;
        }

        boolean hasDiff = false;
        while (true) {
            for (int i = nodeY; i <= y; i++) {
                if ((grid[i][nodeX] == 1) != current.val) {
                    hasDiff = true;
                    break;
                }
            }

            if (hasDiff) {
                break;
            }

            for (int i = nodeX; i <= x; i++) {
                if ((grid[nodeY][i] == 1) != current.val) {
                    hasDiff = true;
                    break;
                }
            }

            if (hasDiff) {
                break;
            }

            if (x + 1 == grid.length || y + 1 == grid.length) {
                break;
            }

            x++;
            y++;
        }

        if (hasDiff) {
            current.topLeft = new Node(current.val, current.isLeaf);
            current.isLeaf = false;
            current.val = true;

            current.topRight = construct(grid, x, nodeY);
            current.bottomLeft = construct(grid, nodeX, y);
            current.bottomRight = construct(grid, x, y);
        }
        return current;
    }
}
