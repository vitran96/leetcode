package tech.chris.leetcode.longestPalindromeByConcatenating2LetterWords;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MySolution implements LongestPalindromeByConcatenating2LetterWords {
    @Override
    public int longestPalindrome (String[] words) {
        Map<String, Integer> dubCounter = new HashMap<>();
        Map<String, Integer> counter = new HashMap<>();
        for (String word : words) {
            if (word.charAt(0) == word.charAt(1)) {
                dubCounter.put(word, dubCounter.getOrDefault(word, 0) + 1);
            } else {
                counter.put(word, counter.getOrDefault(word, 0) + 1);
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
        Set<String> visited = new HashSet<>();
        for (Map.Entry<String, Integer> e : counter.entrySet()) {
            if (visited.contains(e.getKey())) {
                continue;
            }

            String reverse = e.getKey().charAt(1) + "" + e.getKey().charAt(0);
            visited.add(e.getKey());
            visited.add(reverse);

            int reverseStringCounter = counter.getOrDefault(reverse, 0);
            if (e.getValue() == 0 || reverseStringCounter == 0) {
                continue;
            }

            multiple += 2 * 2 * Math.min(e.getValue(), reverseStringCounter);
        }

        return singleDub + multipleDub + multiple;
    }
}
