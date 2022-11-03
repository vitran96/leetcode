package tech.chris.leetcode.longestPalindromeByConcatenating2LetterWords;

/**
 * You are given an array of strings words. Each element of words consists of two lowercase English
 * letters.
 * Create the longest possible palindrome by selecting some elements from words and concatenating
 * them in any order. Each element can be selected at most once.
 * Return the length of the longest palindrome that you can create. If it is impossible to create
 * any palindrome, return 0.
 * A palindrome is a string that reads the same forward and backward.
 * <p>
 * Constraints:
 * <p>
 * 1 <= words.length <= 10^5
 * words[i].length == 2
 * words[i] consists of lowercase English letters.
 */
public interface LongestPalindromeByConcatenating2LetterWords {
    int longestPalindrome (String[] words);
}
