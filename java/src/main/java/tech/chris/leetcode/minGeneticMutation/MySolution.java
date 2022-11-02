package tech.chris.leetcode.minGeneticMutation;

import java.util.*;

public class MySolution implements MinGeneticMutation {
    char[] chars = new char[]{'A', 'C', 'G', 'T'};

    @Override
    public int minMutation (String start, String end, String[] bank) {
        Set<String> set = new HashSet<>();
        Collections.addAll(set, bank);

        if (!set.contains(end)) {
            return -1;
        }

        int level = 0;
        List<String> strings = new LinkedList<>();
        strings.add(start);
        while (strings.size() > 0) {
            List<String> nextStrings = new LinkedList<>();
            level++;
            for (String string : strings) {
                for (char c : chars) {
                    for (int i = 0; i < string.length(); i++) {
                        StringBuilder stringBuilder = new StringBuilder(string);
                        stringBuilder.setCharAt(i, c);
                        String newString = stringBuilder.toString();
                        if (newString.equals(end)) {
                            return level;
                        }

                        if (set.contains(newString)) {
                            nextStrings.add(newString);
                        }
                    }

                }
            }
            strings = nextStrings;
        }
        return -1;
    }
}
