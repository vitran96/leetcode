package tech.chris.leetcode.longestPalindromeByConcatenating2LetterWords;

import java.util.HashSet;
import java.util.Set;

public class MySolution implements LongestPalindromeByConcatenating2LetterWords {
    @Override
    public int longestPalindrome (String[] words) {
        Set<String> visited = new HashSet<>();
        Set<String> validWords = new HashSet<>();
        Set<String> validDubCharWords = new HashSet<>();
        for (String word : words) {
            if (word.charAt(0) == word.charAt(1)) {
                validDubCharWords.add(word);
                continue;
            }

            if (!visited.contains(word)) {
                String reversed = new String(new char[]{word.charAt(1), word.charAt(0)});
                visited.add(reversed);
            } else {
                validWords.add(word);
            }
        }

        if (validWords.size() == 0 && validDubCharWords.size() > 0) {
            return 2;
        }

        return validWords.size() * 2 * 2 + (validDubCharWords.size() > 0 ? 2 : 0);
    }
}
