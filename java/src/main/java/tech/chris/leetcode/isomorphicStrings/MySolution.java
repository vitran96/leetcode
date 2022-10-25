package tech.chris.leetcode.isomorphicStrings;

import java.util.HashMap;
import java.util.Map;

// TODO: can be optimized
public class MySolution implements IsomorphicStrings {
    @Override
    public boolean isIsomorphic (String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            Character value = map.get(sChars[i]);
            if (value != null) {
                if (value.equals(tChars[i])) {
                    continue;
                } else {
                    return false;
                }
            } else if (map.containsValue(tChars[i])) {
                return false;
            }

            map.put(sChars[i], tChars[i]);
        }

        return true;
    }
}
