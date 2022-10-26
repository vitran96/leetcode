package tech.chris.leetcode.checkIf2StringArraysAreEquivalent;

public class NoStreamSolution implements CheckIf2StringArraysAreEquivalent {
    @Override
    public boolean arrayStringsAreEqual (String[] word1, String[] word2) {
        StringBuilder stringBuilder1 = new StringBuilder();
        for (String s : word1) {
            stringBuilder1.append(s);
        }

        StringBuilder stringBuilder2 = new StringBuilder();
        for (String s : word2) {
            stringBuilder2.append(s);
        }

        return stringBuilder1.toString().equals(stringBuilder2.toString());
    }
}
