package tech.chris.leetcode.findPivotIndex;

public class Solution1 implements FindPivotIndex {
    @Override
    public int pivotIndex(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }

        int pivotPoint = 0;
        long leftSum = 0;
        long rightSum = 0;
        for (int i = 1; i < nums.length; i++) {
            rightSum += nums[i];
        }

        while (true) {
            if (leftSum == rightSum) {
                return pivotPoint;
            }

            if (pivotPoint + 1 >= nums.length) {
                break;
            }

            leftSum += nums[pivotPoint];
            pivotPoint++;
            rightSum -= nums[pivotPoint];
        }

        return -1;
    }
}
