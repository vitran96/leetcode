package tech.chris.leetcode.numberOf1Bits;

/**
 * Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
 * <p>
 * Note:
 * <p>
 * Note that in some languages, such as Java, there is no unsigned integer type.
 * In this case, the input will be given as a signed integer type. It should not affect your implementation, as the
 * integer's internal binary representation is the same, whether it is signed or unsigned.
 * In Java, the compiler represents the signed integers using 2's complement notation.
 * <p>
 * The input must be a binary string of length 32.
 */
public interface NumberOf1Bits {
    int hammingWeight (int n);
}
