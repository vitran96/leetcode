package tech.chris.leetcode;

// Given two strings needle and haystack,
// return the index of the first occurrence of needle in haystack,
// or -1 if needle is not part of haystack.
public class StrStr implements ISolution {
    public int strStr (String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
