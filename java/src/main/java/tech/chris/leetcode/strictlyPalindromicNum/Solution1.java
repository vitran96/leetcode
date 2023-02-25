package tech.chris.leetcode.strictlyPalindromicNum;

public class Solution1 implements StrictlyPalindromicNum {
    @Override
    public boolean isStrictlyPalindromic(int n) {
        for (int base = 2; base <= n - 2; base++) {
            String str = Integer.toString(n, base);
            if (!isPalindrome(str)) {
                return false;
            }
        }
        return true;
    }

    private boolean isPalindrome(String str) {
        int l = 0;
        int r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
}
