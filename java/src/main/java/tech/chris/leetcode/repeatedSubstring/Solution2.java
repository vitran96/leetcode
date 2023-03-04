package tech.chris.leetcode.repeatedSubstring;

public class Solution2 implements RepeatedSubstring {
    @Override
    public boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = length / 2; i > 0; i--) {
            if (length % i != 0 || s.charAt(i - 1) != s.charAt(length - 1)) {
                continue;
            }

            String substring = s.substring(0, i);
            int repeat = length / i;
            for (int j = 0; j < repeat; j++) {
                stringBuilder.append(substring);
            }

            if (stringBuilder.toString().equals(s)) {
                return true;
            }

            stringBuilder.setLength(0);
        }

        return false;
    }
}
