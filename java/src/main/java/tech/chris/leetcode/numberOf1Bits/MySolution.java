package tech.chris.leetcode.numberOf1Bits;

public class MySolution implements NumberOf1Bits {
    @Override
    public int hammingWeight (int n) {
        char[] bits = Integer.toUnsignedString(n, 2).toCharArray();
        int result = 0;
        for (char bit : bits) {
            if (bit == '1') {
                result++;
            }
        }

        return result;
    }
}
