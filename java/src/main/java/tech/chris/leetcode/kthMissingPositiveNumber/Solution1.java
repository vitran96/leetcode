package tech.chris.leetcode.kthMissingPositiveNumber;

// This code is quite bad since I cannot explain it my self :(
public class Solution1 implements KthMissingPositiveNumber {
    @Override
    public int findKthPositive(int[] arr, int k) {
        int result = 1;
        int position = 0;
        for (int n : arr) {
            if (n == result) {
                result++;
                continue;
            }

            int diff = n - result;
            if (diff + position >= k) {
                result += k - position - 1;
                position = k;
                break;
            } else {
                result = n + 1;
                position += diff;
            }
        }

        if (position < k) {
            result += k - position - 1;
        }

        return result;
    }
}
