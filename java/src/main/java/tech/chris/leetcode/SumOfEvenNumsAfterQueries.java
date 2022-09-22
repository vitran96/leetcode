package tech.chris.leetcode;

// You are given an integer array nums and an array queries where queries[i] = [val, index].
//
// For each query i, first, apply nums[index] = nums[index] + val, then print the sum of the even values of nums.
//
// Return an integer array answer where answer[i] is the answer to the i th query.
//
//    1 <= nums.length <= 10^4
//    -10^4 <= nums[i] <= 10^4
//    1 <= queries.length <= 10^4
//    -10^4 <= val <= 10^4
//    0 <= index < nums.length
public class SumOfEvenNumsAfterQueries {
    public int[] sumEvenAfterQueries (int[] nums, int[][] queries) {
        int[] result = new int[queries.length];

        int sumOfEvenNums = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                sumOfEvenNums += num;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            final int val = queries[i][0];
            final int index = queries[i][1];

            // Remove the current nums[index] from sum if nums[index] is even
            // to avoid nums[index] become odd after query
            if (nums[index] % 2 == 0) {
                sumOfEvenNums -= nums[index];
            }

            nums[index] += val;

            // Add nums[index] to the sum if nums[index] is even
            if (nums[index] % 2 == 0) {
                sumOfEvenNums += nums[index];
            }

            result[i] = sumOfEvenNums;
        }

        return result;
    }
}
