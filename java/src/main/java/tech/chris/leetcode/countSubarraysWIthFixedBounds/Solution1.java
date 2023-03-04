package tech.chris.leetcode.countSubarraysWIthFixedBounds;

import java.util.LinkedList;
import java.util.List;

public class Solution1 implements CountSubarraysWithFixedBounds {
    @Override
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int result = 0;

        List<Integer> minKIndexes = new LinkedList<>();
        List<Integer> maxKIndexes = new LinkedList<>();
        int l = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minK || nums[i] > maxK) {
                if (minKIndexes.size() > 0 && maxKIndexes.size() > 0) {
                    //
                }

                minKIndexes.clear();
                maxKIndexes.clear();
                l = i + 1;
            }

            if (nums[i] == minK) {
                minKIndexes.add(nums[i]);
            } else if (nums[i] == maxK) {
                maxKIndexes.add(nums[i]);
            }
        }

        if (l < nums.length && minKIndexes.size() > 0 && maxKIndexes.size() > 0) {
            //
        }

        return result;
    }

    private long countSubarrays(int[] nums,
                                int l,
                                int r,
                                List<Integer> minKIndexes,
                                List<Integer> maxKIndexes) {
        int lowestKIndex = Math.min(minKIndexes.get(0), maxKIndexes.get(0));
        int highestKIndex = Math.max(minKIndexes.get(minKIndexes.size() - 1), maxKIndexes.get(
            maxKIndexes.size() - 1));
        return 0;
    }
}
