package tech.chris.leetcode.excelSheetColumnNumber;

public class MySolution implements ExcelSheetColumnNumber {
    @Override
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
