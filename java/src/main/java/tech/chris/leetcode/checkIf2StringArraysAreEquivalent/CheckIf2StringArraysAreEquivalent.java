package tech.chris.leetcode.checkIf2StringArraysAreEquivalent;

/**
 * Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
 * A string is represented by an array if the array elements concatenated in order forms the string.
 * <p>
 * <p>
 * 1 <= word1.length, word2.length <= 10^3
 * 1 <= word1[i].length, word2[i].length <= 10^3
 * 1 <= sum(word1[i].length), sum(word2[i].length) <= 10^3
 * word1[i] and word2[i] consist of lowercase letters.
 */
public interface CheckIf2StringArraysAreEquivalent {
    boolean arrayStringsAreEqual (String[] word1, String[] word2);
}
