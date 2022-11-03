package tech.chris.leetcode.longestPalindromeByConcatenating2LetterWords;

import java.util.HashMap;
import java.util.Map;

public class MySolution implements LongestPalindromeByConcatenating2LetterWords {
    @Override
    public int longestPalindrome (String[] words) {
        Map<String, Integer> dubCounter = new HashMap<>();
        Map<String, Integer> counter = new HashMap<>();
        for (String word : words) {
            if (word.charAt(0) == word.charAt(1)) {
                dubCounter.put(word, dubCounter.getOrDefault(word, 0) + 1);
            } else {
                if (counter.containsKey(word)) {
                    counter.put(word, counter.getOrDefault(word, 0) + 1);
                } else {
                    String reverse = new String(new char[]{word.charAt(1), word.charAt(0)});
                    counter.put(reverse, counter.getOrDefault(reverse, 0) + 1);
                }
            }
        }

        int singleDub = 0;
        int multipleDub = 0;
        for (Map.Entry<String, Integer> e : dubCounter.entrySet()) {
            if (singleDub == 0 && e.getValue() % 2 != 0) {
                singleDub = 2;
            }

            if (e.getValue() > 1) {
                multipleDub += 2 * (e.getValue() % 2 == 0 ? e.getValue() : e.getValue() - 1);
            }
        }

        int multiple = 0;
        for (Map.Entry<String, Integer> e : counter.entrySet()) {
            if (e.getValue() > 1) {
                multiple += 2 * (e.getValue() % 2 == 0 ? e.getValue() : e.getValue() - 1);
            }
        }

        return singleDub + multipleDub + multiple;
    }
}
