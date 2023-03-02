package tech.chris.leetcode.sortAnArray;

import java.util.Arrays;

public class Solution1 implements SortAnArray {
    @Override
    public int[] sortArray(int[] nums) {
        int[] result = Arrays.copyOf(nums, nums.length);
        quickSort(result, 0, result.length - 1);
        return result;
    }

    public void quickSort(int[] nums, int l, int r) {
        if (l >= r) {
            return;
        }

        int pivot = nums[r];
        int j = l - 1;
        for (int i = l; i <= r - 1; i++) {
            if (nums[i] < pivot) {
                j++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        int temp = nums[j + 1];
        nums[j + 1] = pivot;
        nums[r] = temp;

        quickSort(nums, l, j);
        quickSort(nums, j + 2, r);
    }
}
