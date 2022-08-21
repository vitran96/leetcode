package tech.chris.leetcode;

import java.util.Arrays;
import java.util.Comparator;

// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix,return an empty string"".
public final class LongestCommonPrefix {
    // TODO: need optimization
    public static String solution(String[] strs) {
        String prefix = Arrays.stream(strs).min(Comparator.comparingInt(String::length)).orElse("");
        if (prefix.length() == 0) {
            return prefix;
        }

        for (String str : strs) {
            while (!str.startsWith(prefix)) {
                if (prefix.length() == 1) {
                    prefix = "";
                } else {
                    prefix = prefix.substring(0, prefix.length() - 1);
                }
            }
        }
        return prefix;
    }
}
