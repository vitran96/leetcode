package tech.chris.leetcode.constructQuadTree;

import tech.chris.leetcode.quadtree.Node;

public class Solution1 implements ConstructQuadTree {

    @Override
    public Node construct(int[][] grid) {
        return construct(grid, 0, 0, grid.length - 1, grid.length - 1);
    }


    private Node construct(int[][] grid, int colStart, int rowStart, int colEnd, int rowEnd) {
        Node current = new Node(grid[rowStart][colStart] == 1, true);
        if (colStart >= grid.length || rowStart >= grid.length) {
            return current;
        }

        int x = colStart + 1;
        int y = rowStart + 1;
        boolean hasDiff = false;
        while (x <= colEnd || y <= rowEnd) {
            for (int i = rowStart; i <= y; i++) {
                if ((grid[i][colStart] == 1) != current.val) {
                    hasDiff = true;
                    break;
                }
            }

            if (hasDiff) {
                break;
            }

            for (int i = colStart; i <= x; i++) {
                if ((grid[rowStart][i] == 1) != current.val) {
                    hasDiff = true;
                    break;
                }
            }

            if (hasDiff) {
                break;
            }

            x++;
            y++;
        }

        if (hasDiff) {
            current.topLeft = new Node(current.val, current.isLeaf);
            current.isLeaf = false;
            current.val = true;

            current.topRight = construct(grid, x, rowStart, colEnd, y - 1);
            current.bottomLeft = construct(grid, colStart, y, x - 1, rowEnd);
            current.bottomRight = construct(grid, x, y, colEnd, rowEnd);
        }
        return current;
    }
}
