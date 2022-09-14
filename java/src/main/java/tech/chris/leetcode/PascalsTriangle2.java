package tech.chris.leetcode;

import java.util.ArrayList;
import java.util.List;

// Given an integer numRows, return the first numRows of Pascal's triangle.
//
// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
//
// 1 <= numRows <= 30
public class PascalsTriangle2 {
    // TODO: optimization can be done with pure math + 1 loop (window sliding)
    public List<Integer> getRow (int rowIndex) {
        List<Integer> lastRow = null;

        for (int i = 0; i < rowIndex + 1; i++) {
            List<Integer> currentRow = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    currentRow.add(1);
                } else {
                    currentRow.add(lastRow.get(j - 1) + lastRow.get(j));
                }
            }
            lastRow = currentRow;
        }

        return lastRow;
    }
}
