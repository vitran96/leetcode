package tech.chris.leetcode.excelSheetColumnNumber;

/**
 * Given a string columnTitle that represents the column title as appears in an Excel sheet,
 * return its corresponding column number.
 * <p>
 * 1 <= columnTitle.length <= 7
 * columnTitle consists only of uppercase English letters.
 * columnTitle is in the range ["A", "FXSHRXW"].
 */
public class OptimizedSolution implements ExcelSheetColumnNumber {
    @Override
    public int titleToNumber (String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            result *= 26;
            result += (columnTitle.charAt(i) - 'A' + 1);
        }

        return result;
    }
}
