package tech.chris.leetcode.wordSearch2;

import javafx.util.Pair;

import java.util.*;

public class MySolution implements WordSearch2 {

    @Override
    public List<String> findWords (char[][] board, String[] words) {
        // Scan and get all related position
        // Then do DFS to find
        Map<Character, List<Pair<Integer, Integer>>> records = new HashMap<>();
        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[y].length; x++) {
                if (!records.containsKey(board[y][x])) {
                    records.put(board[y][x], new LinkedList<>());
                } else {
                    records.get(board[y][x]).add(new Pair<>(x, y));
                }
            }
        }

        List<String> result = new LinkedList<>();
        for (String word : words) {
            char[] chars = word.toCharArray();
            List<Pair<Integer, Integer>> cPositions = records.get(chars[0]);
            if (cPositions.size() == 0) {
                continue;
            }

            // For each start position
            // go to the next?
            // if next is not possible
            // then go back once
            // until the start position
            // else if can go next
            // then put to stack and continue
            // else if is the end position
            // go to next word
            for (Pair<Integer, Integer> start : cPositions) {
                int i = 1;
                Stack<Pair<Integer, Integer>> stack = new Stack<>();
                stack.push(start);
                boolean found = false;
                Pair<Integer, Integer> current = start;
            }
        }
        return null;
    }
}
