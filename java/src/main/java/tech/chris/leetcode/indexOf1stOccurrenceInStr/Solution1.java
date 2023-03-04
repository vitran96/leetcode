package tech.chris.leetcode.indexOf1stOccurrenceInStr;

public class Solution1 implements IndexOf1stOccurrenceInStr {
    @Override
    public int strStr(String haystack, String needle) {
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (stringBuilder.length() != needle.length()) {
                stringBuilder.append(haystack.charAt(i));
            }

            if (stringBuilder.length() == needle.length()) {
                if (needle.equals(stringBuilder.toString())) {
                    return index;
                } else {
                    stringBuilder.deleteCharAt(0);
                    index++;
                }
            }
        }

        return -1;
    }
}
