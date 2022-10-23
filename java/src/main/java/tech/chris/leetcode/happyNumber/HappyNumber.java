package tech.chris.leetcode.happyNumber;

/**
 * Write an algorithm to determine if a number n is happy.
 * <p>
 * A happy number is a number defined by the following process:
 * <p>
 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy.
 * <p>
 * Return true if n is a happy number, and false if not.
 * <p>
 * 1 <= n <= 2^31 - 1
 */
public interface HappyNumber {
    boolean isHappy (int n);
}
