package tech.chris.leetcode.countSubarraysWIthFixedBounds;

public class Solution1 implements CountSubarraysWithFixedBounds {
    @Override
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long result = 0;

        int l = -1;
        int lastMin = -1;
        int lastMax = -1;
        // Window sliding technique
        // We don't need to put "i" into the formula since as long as the current sub-array is
        // within the boundary, we can keep increase the counter with our formula
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minK || nums[i] > maxK) {
                l = i;
            }

            if (nums[i] == minK) {
                lastMin = i;
            }

            if (nums[i] == maxK) {
                lastMax = i;
            }

            // If minus result is less than 0, it won't be added to the result
            // Eg: if lastMin / lastMax is <= left index -> Math.min(lastMin, lastMax) - l will always be negative
            // -> <= 0 -> result += 0
            result += Math.max(0, Math.min(lastMin, lastMax) - l);
        }

        return result;
    }
}
