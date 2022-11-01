package tech.chris.leetcode.whereWillTheBallFall;

public class Solution2 implements WhereWillTheBallFall {
    private static int dropBall (int[][] grid, int p) {
        for (int i = 0; i < grid.length; i++) {
            int next = p + grid[i][p];
            if (next < 0 || next >= grid[0].length || grid[i][next] != grid[i][p]) {
                p = -1;
                break;
            }
            p = next;
        }

        return p;
    }

    @Override
    public int[] findBall (int[][] grid) {
        int[] ans = new int[grid[0].length];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = dropBall(grid, i);
        }

        return ans;
    }
}
