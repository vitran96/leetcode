package tech.chris.leetcode;

//Given an integer x,return true if x is palindrome integer.
//An integer is a palindrome when it reads the same backward as forward.
public class IsPalindrome implements ISolution {
    // TODO: re-implement with math
    public static boolean solution(final int x) {
        if (x < 0) {
            return false;
        }
        String str = String.valueOf(x);
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
