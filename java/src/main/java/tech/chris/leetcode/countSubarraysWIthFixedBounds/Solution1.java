package tech.chris.leetcode.countSubarraysWIthFixedBounds;

public class Solution1 implements CountSubarraysWithFixedBounds {
    @Override
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int result = 0;

        int l = -1;
        int lastMin = -1;
        int lastMax = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minK || nums[i] > maxK) {
                l = i;
                lastMin = -1;
                lastMax = -1;
            }

            if (nums[i] == minK) {
                lastMin = i;
            }

            if (nums[i] == maxK) {
                lastMax = i;
            }

            result += Math.max(0, Math.min(lastMin, lastMax) - l);
        }

        return result;
    }
}
