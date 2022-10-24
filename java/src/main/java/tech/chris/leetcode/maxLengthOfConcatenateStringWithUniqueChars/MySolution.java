package tech.chris.leetcode.maxLengthOfConcatenateStringWithUniqueChars;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

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

    private static void parseUniqueString (List<String> arr, List<String> uniqueStr, int i, String str) {
        for (int j = i + 1; j < arr.size(); j++) {
            String nextStr = str + arr.get(j);
            if (isUnique(nextStr)) {
                uniqueStr.add(nextStr);
            }

            parseUniqueString(arr, uniqueStr, j, nextStr);
        }
    }

    @Override
    public int maxLength (List<String> arr) {
        arr = arr.stream().filter(MySolution::isUnique).collect(Collectors.toList());
        List<String> uniqueString = new LinkedList<>(arr);
        for (int i = 0; i < arr.size(); i++) {
            String str = arr.get(i);
            parseUniqueString(arr, uniqueString, i, str);
        }
        return uniqueString.stream().max(Comparator.comparingInt(String::length)).orElse("").length();
    }
}
