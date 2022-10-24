package tech.chris.leetcode.maxLengthOfConcatenateStringWithUniqueChars;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MySolution implements MaxLengthOfConcatenateStringWithUniqueChars {
    private static boolean isUnique (String str) {
        boolean result = true;
        boolean[] checkers = new boolean[26];
        for (char c : str.toCharArray()) {
            int i = c - 'a';
            if (checkers[i]) {
                result = false;
                break;
            }

            checkers[i] = true;
        }

        return result;
    }

    @Override
    public int maxLength (List<String> arr) {
        List<String> uniqueString = new LinkedList<>();
        for (int i = 0; i < arr.size(); i++) {
            String str = arr.get(i);
            if (!isUnique(str)) {
                continue;
            }

            uniqueString.add(str);

            for (int j = i + 1; j < arr.size(); j++) {
                if (!isUnique(str)) {
                    continue;
                }

                String newStr = str + arr.get(j);
                if (isUnique(newStr)) {
                    uniqueString.add(newStr);
                }
            }
        }

        return uniqueString.stream().max(Comparator.comparingInt(String::length)).orElse("").length();
    }
}
