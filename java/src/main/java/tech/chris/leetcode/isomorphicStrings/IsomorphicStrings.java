package tech.chris.leetcode.isomorphicStrings;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
 * <p>
 * Constraints:
 * <ul>
 *     <li>1 <= s.length <= 5 * 10^4</li>
 *     <li>t.length == s.length</li>
 *     <li>s and t consist of any valid ascii character.</li>
 * </ul>
 */
public interface IsomorphicStrings {
    boolean isIsomorphic (String s, String t);
}
