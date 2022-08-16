package tech.chris.leetcode;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/*
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.s
 */
public final class ReverseInt implements ISolution {
    public static int solution(int x) {
        String reversedIntChars = "";
        String intChars = String.valueOf(x);
        if (x < 0) {
            reversedIntChars = "-";
            intChars = intChars.replaceFirst("-", "");
        }

        for (int i = intChars.length() - 1; i >= 0; i--) {
            reversedIntChars += intChars.charAt(i);
        }

        long result = Long.parseLong(reversedIntChars);

        return result > Integer.MAX_VALUE || result < Integer.MIN_VALUE ? 0 : (int)result;
    }
}
