package tech.chris.leetcode.checkIf2StringArraysAreEquivalent;

import java.util.Arrays;

public class MySolution implements CheckIf2StringArraysAreEquivalent {
    @Override
    public boolean arrayStringsAreEqual (String[] word1, String[] word2) {
        String w1 = Arrays.stream(word1).reduce("", (a, b) -> a + b);
        String w2 = Arrays.stream(word2).reduce("", (a, b) -> a + b);
        return w1.equals(w2);
    }
}
