package tech.chris.leetcode.toeplitzMatrix;

public class MySolution implements ToeplitzMatrix {
    @Override
    public boolean isToeplitzMatrix (int[][] matrix) {
        int width = matrix[0].length;
        int height = matrix.length;

        int[] lastRow = matrix[0];
        for (int i = 1; i < height; i++) {
            int[] currentRow = matrix[i];
            for (int j = 0; j < width - 1; j++) {
                if (lastRow[j] != currentRow[j + 1]) {
                    return false;
                }
            }

            lastRow = currentRow;
        }

        return true;
    }
}
