package tech.chris.leetcode.isSubsequence;

/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * <p>
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 * <p>
 * Constraints:
 * * 0 <= s.length <= 100
 * * 0 <= t.length <= 10^4
 * * s and t consist only of lowercase English letters.
 * <p>
 * Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 10^9, and you want to check one by one to see if t has its subsequence. In this scenario, how would you change your code?
 */
public interface IsSubsequence {
    boolean isSubsequence(String s, String t);
}