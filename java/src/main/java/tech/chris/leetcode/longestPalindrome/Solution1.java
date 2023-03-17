package tech.chris.leetcode.longestPalindrome;

public class Solution1 implements LongestPalindrome {
    @Override
    public int longestPalindrome(String s) {
        int[] counter = new int['z' - 'A' + 1];
        char[] array = s.toCharArray();
        for (char c : array) {
            counter[c - 'A']++;
        }

        int palindromeSize = 0;
        boolean hasOdd = false;
        for (int n : counter) {
            if (n < 1) {
                continue;
            }

            if (n % 2 == 0) {
                palindromeSize += n;
            } else {
                palindromeSize += n - 1;
                hasOdd = true;
            }
        }

        if (hasOdd) {
            palindromeSize++;
        }

        return palindromeSize;
    }
}
