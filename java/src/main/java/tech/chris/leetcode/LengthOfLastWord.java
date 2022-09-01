package tech.chris.leetcode;

import java.util.Arrays;

//Given a string s consisting of words and spaces,return the length of the last word in the string.
//
//A word is a maximal substring consisting of non-space characters only.
public class LengthOfLastWord {
    public int lengthOfLastWord (String s) {
        String[] strings = Arrays.stream(s.split(" ")).filter(v -> !v.isEmpty()).toArray(String[]::new);
        return strings[strings.length - 1].length();
    }
}
