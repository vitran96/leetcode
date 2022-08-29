package tech.chris.leetcode;

// You are given a large integer represented as an integer array digits,
// where each digits[i]is the ith digit of the integer.
// The digits are ordered from most significant to least significant in left-to-right order.
// The large integer does not contain any leading 0's.
//
// Increment the large integer by one and return the resulting array of digits.
public class PlusOne implements ISolution {
    public int[] plusOne (int[] digits) {
        boolean hasRemain = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1 || hasRemain) {
                digits[i]++;
            }

            if (digits[i] >= 10) {
                digits[i] -= 10;
                hasRemain = true;
            } else {
                hasRemain = false;
            }
        }

        int[] results;
        if (hasRemain) {
            results = new int[digits.length + 1];
            System.arraycopy(digits, 0, results, 1, digits.length);
            results[0] = 1;
        } else {
            results = digits;
        }

        return results;
    }
}
