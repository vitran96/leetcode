package tech.chris.leetcode;

import java.util.HashSet;
import java.util.Set;

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

        Set<Integer> setOfOddIndex = new HashSet<>();
        int sumOfEvenNums = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                sumOfEvenNums += nums[i];
            } else {
                setOfOddIndex.add(i);
            }
        }

        for (int i = 0; i < queries.length; i++) {
            final int[] query = queries[i];

            final int val = query[0];
            final int index = query[1];

            final int currentVal = nums[index];
            nums[index] = val + currentVal;

            if (nums[index] % 2 == 0) {
                if (setOfOddIndex.remove(index)) {
                    sumOfEvenNums += nums[index];
                } else {
                    sumOfEvenNums += val;
                }
            } else {
                if (!setOfOddIndex.contains(index)) {
                    sumOfEvenNums -= currentVal;
                    setOfOddIndex.add(index);
                }
            }

            result[i] = sumOfEvenNums;
        }

        return result;
    }
}
