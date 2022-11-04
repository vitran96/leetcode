package tech.chris.leetcode.reverseVowelsOfString;

import java.util.HashSet;
import java.util.Set;

public class MySolution implements ReverseVowelsOfString {
    private static final Set<Character> vowelChars = new HashSet<Character>() {{
        add('a');
        add('e');
        add('i');
        add('o');
        add('u');
    }};

    @Override
    public String reverseVowels (String s) {
        int l = 0;
        int r = s.length() - 1;
        char[] chars = s.toCharArray();
        while (true) {
            while (!vowelChars.contains(Character.toLowerCase(chars[l]))) {
                if (l >= r) {
                    break;
                }
                l++;
            }

            while (!vowelChars.contains(Character.toLowerCase(chars[r]))) {
                if (l >= r) {
                    break;
                }
                r--;
            }

            if (l >= r) {
                break;
            }

            char c = chars[l];
            chars[l] = chars[r];
            chars[r] = c;
            l++;
            r--;
        }

        return new String(chars);
    }
}
