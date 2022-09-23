package tech.chris.leetcode;

// Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
// 1 <= columnNumber <= 2^31 - 1
public class ExcelSheetColumnTitle {

    // TODO: should attempt to do this again at some point
    public String convertToTitle (int columnNumber) {
        // columnNumber must be shifted by 1
        // Why?
        // Image A index is 0 and Z is 25
        // If not deduce by 1, we can get weird number after a mod
        // EG: 27 (A) % 26 => 1 (B) -> 1 % 26 => 1 (B) ==> BB -> WRONG
        // 27 - 1 % 26 => 0 (A) -> 1 - 1 % 26 => 0 (A) ==> AA -> CORRECT
        return columnNumber == 0 ? "" : convertToTitle(--columnNumber / 26) + (char) ('A' + (columnNumber % 26));
    }
}
