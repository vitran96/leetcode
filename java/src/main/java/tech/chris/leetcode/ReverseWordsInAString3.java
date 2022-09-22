package tech.chris.leetcode;

// Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
//
// 1 <= s.length <= 5*10^4
// s contains printable ASCII characters.
// s does not contain any leading or trailing spaces.
// There is at least one word in s.
// All the words in s are separated by a single space.
public class ReverseWordsInAString3 {
    public String reverseWords (String s) {
        StringBuilder wordBuffer = new StringBuilder();
        StringBuilder stringBuffer = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == ' ') {
                wordBuffer.insert(0, c);
                stringBuffer.insert(0, wordBuffer);
                wordBuffer.setLength(0);
            } else {
                wordBuffer.append(c);
            }
        }

        stringBuffer.insert(0, wordBuffer);

        return stringBuffer.toString();
    }
}
