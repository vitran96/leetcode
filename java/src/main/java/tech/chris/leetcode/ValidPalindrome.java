package tech.chris.leetcode;

// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
// it reads the same forward and backward. Alphanumeric characters include letters and numbers.
// Given a string s, return true if it is a palindrome, or false otherwise.
// 1 <= s.length <= 2*10^5
// s consists only of printable ASCII characters.
public class ValidPalindrome {
    // TODO: can be faster without RegEx or even "toLowerCase"
    public boolean isPalindrome (String s) {
        String filteredString = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int l = 0;
        int r = filteredString.length() - 1;

        while (l <= r) {
            if (filteredString.charAt(l) != filteredString.charAt(r)) {
                return false;
            }

            l++;
            r--;
        }
        return true;
    }
}
