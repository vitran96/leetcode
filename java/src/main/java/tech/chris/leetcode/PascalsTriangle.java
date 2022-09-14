package tech.chris.leetcode;

import java.util.LinkedList;
import java.util.List;

// Given an integer numRows, return the first numRows of Pascal's triangle.
//
// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
//
// 1 <= numRows <= 30
public class PascalsTriangle {
    public List<List<Integer>> generate (int numRows) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> lastRow = null;

        for (int i = 0; i < numRows; i++) {
            List<Integer> currentRow = new LinkedList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    currentRow.add(1);
                } else {
                    currentRow.add(lastRow.get(j - 1) + lastRow.get(j));
                }
            }
            result.add(currentRow);
            lastRow = currentRow;
        }

        return result;
    }
}
