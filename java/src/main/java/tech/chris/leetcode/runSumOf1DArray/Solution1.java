package tech.chris.leetcode.runSumOf1DArray;

public class Solution1 implements RunSumOf1DArray {
    @Override
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            result[i] = currentSum;
        }
        return result;
    }
}
