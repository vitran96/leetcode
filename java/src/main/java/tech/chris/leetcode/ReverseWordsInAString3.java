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
        String[] strings = s.split(" ");

        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strings) {
            for (int i = str.length() - 1; i >= 0; i--) {
                stringBuilder.append(str.charAt(i));
            }
            stringBuilder.append(" ");
        }

        return stringBuilder.toString().trim();
    }
}
