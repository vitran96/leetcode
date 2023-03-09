package tech.chris.leetcode.runSumOf1DArray;

/**
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 * <p>
 * Constraints:
 * * 1 <= nums.length <= 1000
 * * -10^6 <= nums[i] <= 10^6
 */
public interface RunSumOf1DArray {
    int[] runningSum(int[] nums);
}
