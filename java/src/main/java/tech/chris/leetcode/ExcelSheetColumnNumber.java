package tech.chris.leetcode;

/**
 * Given a string columnTitle that represents the column title as appears in an Excel sheet,
 * return its corresponding column number.
 * <p>
 * 1 <= columnTitle.length <= 7
 * columnTitle consists only of uppercase English letters.
 * columnTitle is in the range ["A", "FXSHRXW"].
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber (String columnTitle) {
        int powerOf = 0;
        long result = 0;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            result += Math.pow(26, powerOf) * (columnTitle.charAt(i) - 'A' + 1);
            powerOf++;
        }

        return ((int) result);
    }
}
