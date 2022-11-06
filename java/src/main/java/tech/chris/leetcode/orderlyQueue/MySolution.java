package tech.chris.leetcode.orderlyQueue;

import java.util.Arrays;

// TODO: optimize using Booth's algorithm
public class MySolution implements OrderlyQueue {
    @Override
    public String orderlyQueue (String s, int k) {
        if (k > 1) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        } else if (s.length() == 1) {
            return s;
        }

        int length = s.length();
        String current = s;
        for (int i = 0; i < length; i++) {
            current = current.substring(1, length) + current.charAt(0);
            //noinspection IfStatementMissingBreakInLoop
            if (current.compareTo(s) < 0) {
                s = current;
            }
        }
        return s;
    }
}
