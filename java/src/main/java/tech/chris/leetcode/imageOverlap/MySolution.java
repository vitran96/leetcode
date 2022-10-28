package tech.chris.leetcode.imageOverlap;

import java.util.Arrays;

public class MySolution implements ImageOverlap {
    private static int[][] getBlockOf1 (int[][] img) {
        int topIndex = img.length - 1;
        int bottomIndex = -1;
        int rightIndex = -1;
        int leftIndex = img.length - 1;
        for (int i = 0; i < img.length; i++) {
            int[] row = img[i];
            for (int j = 0; j < row.length; j++) {
                int val = row[j];
                if (val == 0) {
                    continue;
                }

                if (i < topIndex) {
                    topIndex = i;
                } else if (i > bottomIndex) {
                    bottomIndex = i;
                }

                if (j < leftIndex) {
                    leftIndex = j;
                } else if (j > rightIndex) {
                    rightIndex = j;
                }
            }
        }

        int[][] result = new int[bottomIndex - topIndex + 1][rightIndex - leftIndex + 1];
        for (int i = topIndex; i <= bottomIndex; i++) {
            int[] row = img[i];
            int[] resultRow = new int[result[0].length];
            if (rightIndex + 1 - leftIndex >= 0)
                System.arraycopy(row, leftIndex, resultRow, 0, rightIndex + 1 - leftIndex);
            result[i - topIndex] = resultRow;
        }

        return result;
    }

    @Override
    public int largestOverlap (int[][] img1, int[][] img2) {
        int[][] img1BlockOf1 = getBlockOf1(img1);
        int[][] img2BlockOf1 = getBlockOf1(img2);

        System.out.println(Arrays.deepToString(img1BlockOf1));
        System.out.println(Arrays.deepToString(img2BlockOf1));
        return 0;
    }
}
