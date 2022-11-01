package tech.chris.leetcode.whereWillTheBallFall;

import java.util.stream.IntStream;

public class MySolution implements WhereWillTheBallFall {
    @Override
    public int[] findBall (int[][] grid) {
        int[] result = IntStream.range(0, grid[0].length).toArray();

        for (int[] ints : grid) {
            for (int j = 0; j < result.length; j++) {
                if (result[j] == -1) {
                    continue;
                }

                int p = result[j];
                result[j] += ints[p];
                if (result[j] < 0 || result[j] >= result.length) {
                    result[j] = -1;
                } else if (p > 0 && ints[p] == -1 && ints[p - 1] == 1) {
                    result[j] = -1;
                } else if (p < ints.length - 1 && ints[p] == 1 && ints[p + 1] == -1) {
                    result[j] = -1;
                }
            }
        }

        return result;
    }
}
