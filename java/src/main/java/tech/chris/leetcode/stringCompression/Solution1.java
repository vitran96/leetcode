package tech.chris.leetcode.stringCompression;

public class Solution1 implements StringCompression {
    @Override
    public int compress(char[] chars) {
        if (chars.length == 0) {
            return 0;
        }

        char currentChar = chars[0];
        int counter = 1;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(currentChar);
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == currentChar) {
                counter++;
            } else {
                currentChar = chars[i];
                if (counter > 1) {
                    stringBuilder.append(counter);
                }

                stringBuilder.append(currentChar);
                counter = 1;
            }
        }


        if (counter > 1) {
            stringBuilder.append(counter);
        }

        for (int i = 0; i < stringBuilder.length(); i++) {
            chars[i] = stringBuilder.charAt(i);
        }

        return stringBuilder.length();
    }
}
