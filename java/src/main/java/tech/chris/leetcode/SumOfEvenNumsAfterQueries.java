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

        for (int i = 0; i < queries.length; i++) {
            final int[] query = queries[i];
            final int val = query[0];
            final int index = query[1];

            nums[index] = nums[index] + val;
            int sumOfEvenNums = 0;
            for (final int num : nums) {
                if (num % 2 == 0) {
                    sumOfEvenNums += num;
                }
            }

            result[i] = sumOfEvenNums;
        }

        return result;
    }
}
