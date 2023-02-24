package tech.chris.leetcode.int2roman;

import java.util.Collections;

public class Solution1 implements Int2Roman {
    @Override
    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        int divided = 0;
        while (num > 0) {
            if (num >= 1000) {
                divided = num / 1000;
                num %= 1000;
                result.append(String.join("", Collections.nCopies(divided, "M")));
            } else if (num >= 900) {
                num %= 900;
                result.append("CM");
            } else if (num >= 500) {
                num %= 500;
                result.append("D");
            } else if (num >= 400) {
                num %= 400;
                result.append("CD");
            } else if (num >= 100) {
                divided = num / 100;
                num %= 100;
                result.append(String.join("", Collections.nCopies(divided, "C")));
            } else if (num >= 90) {
                num %= 90;
                result.append("XC");
            } else if (num >= 50) {
                num %= 50;
                result.append("L");
            } else if (num >= 40) {
                num %= 40;
                result.append("XL");
            } else if (num >= 10) {
                divided = num / 10;
                num %= 10;
                result.append(String.join("", Collections.nCopies(divided, "X")));
            } else if (num == 9) {
                num %= 9;
                result.append("IX");
            } else if (num >= 5) {
                num %= 5;
                result.append("V");
            } else if (num == 4) {
                num %= 4;
                result.append("IV");
            } else {
                result.append(String.join("", Collections.nCopies(num, "I")));
                num = 0;
            }
        }
        return result.toString();
    }
}
