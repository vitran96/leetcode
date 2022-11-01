package tech.chris.leetcode.toeplitzMatrix;

/**
 * Given an m x n matrix, return true if the matrix is Toeplitz. Otherwise, return false.
 * A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements.
 * <p>
 * Constraints:
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 20
 * 0 <= matrix[i][j] <= 99
 * <p>
 * Follow up:
 * What if the matrix is stored on disk, and the memory is limited such that you can only load at most one row of the
 * matrix into the memory at once?
 * What if the matrix is so large that you can only load up a partial row into the memory at once?
 */
public interface ToeplitzMatrix {
    boolean isToeplitzMatrix (int[][] matrix);
}
