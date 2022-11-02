package tech.chris.leetcode.minGeneticMutation;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class MySolution implements MinGeneticMutation {
    char[] chars = new char[]{'A', 'C', 'G', 'T'};

    @Override
    public int minMutation (String start, String end, String[] bank) {
        boolean endIsValid = false;
        for (String item : bank) {
            if (item.equals(end)) {
                endIsValid = true;
                break;
            }
        }

        if (!endIsValid) {
            return -1;
        }

        int level = 0;
        Set<String> visited = new HashSet<>();
        List<String> strings = new LinkedList<>();
        strings.add(start);
        while (strings.size() > 0) {
            List<String> nextStrings = new LinkedList<>();
            level++;
            for (String string : strings) {
                for (String item : bank) {
                    if (visited.contains(item) || item.equals(string)) {
                        continue;
                    }

                    int count = 0;
                    for (int i = 0; i < string.length(); i++) {
                        if (string.charAt(i) != item.charAt(i)) {
                            count++;
                        }
                    }

                    if (count == 1) {
                        if (item.equals(end)) {
                            return level;
                        }
                        nextStrings.add(item);
                    }
                }
                visited.add(string);
            }
            strings = nextStrings;
        }
        return -1;
    }
}
