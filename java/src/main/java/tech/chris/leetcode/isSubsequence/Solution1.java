package tech.chris.leetcode.isSubsequence;

public class Solution1 implements IsSubsequence {
    @Override
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        int sSize = s.length();
        char[] sChars = s.toCharArray();

        int tSize = t.length();
        char[] tChars = t.toCharArray();
        while (i < sSize && j < tSize) {
            if (sChars[i] == tChars[j]) {
                i++;
            }

            j++;
        }

        return i == s.length();
    }
}
