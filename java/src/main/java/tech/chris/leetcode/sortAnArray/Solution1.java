package tech.chris.leetcode.sortAnArray;

public class Solution1 implements SortAnArray {
    @Override
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int l, int r) {
        if (l >= r) {
            return;
        }

        int mid = (l + r) / 2;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid + 1, r);
        mergeSort(nums, l, mid, r);
    }

    private void mergeSort(int[] nums, int l, int mid, int r) {
        int[] L = new int[mid - l + 1];
        int[] R = new int[r - mid];
        System.arraycopy(nums, l, L, 0, L.length);

        for (int i = 0; i < R.length; i++) {
            R[i] = nums[mid + 1 + i];
        }

        int i = 0;
        int j = 0;

        int subArrayIndex = l;
        while (i < L.length || j < R.length) {
            if (j >= R.length || i < L.length && L[i] <= R[j]) {
                nums[subArrayIndex] = L[i];
                i++;
            } else {
                nums[subArrayIndex] = R[j];
                j++;
            }

            subArrayIndex++;
        }
    }
}
