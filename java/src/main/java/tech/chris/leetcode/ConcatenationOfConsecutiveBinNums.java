package tech.chris.leetcode;

import java.math.BigInteger;

// Given an integer n, return the decimal value of the binary string formed by concatenating the binary
// representations of 1 to n in order, modulo 10^9 + 7.
// 1 <= n <= 10^5
public class ConcatenationOfConsecutiveBinNums {
    private static final BigInteger MOD_CONST = new BigInteger(String.valueOf(((long) Math.pow(10, 9)) + 7));

    public int concatenatedBinary (int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= n; i++) {

            stringBuilder.append(Integer.toBinaryString(i));
        }

        BigInteger num = new BigInteger(stringBuilder.toString(), 2);
        return num.mod(MOD_CONST).intValue();
    }
}
