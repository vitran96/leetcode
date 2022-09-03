package tech.chris.leetcode;

// You are given two integer arrays nums1 and nums2,
// sorted in non-decreasing order,and two integers m and n,representing the number of elements in nums1 and nums2 respectively.
//
// Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//
// The final sorted array should not be returned by the function,
// but instead be stored inside the array nums1.
// To accommodate this,nums1 has a length of m+n,
// where the first m elements denote the elements that should be merged,
// and the last n elements are set to 0and should be ignored.
// nums2 has a length of n.

// nums1.length == m + n
// nums2.length == n
// 0 <= m, n <= 200
// 1 <= m + n <= 200
// -10^9 <= nums1[i], nums2[j] <= 10^9
public class MergeSortedArray {
    public void merge (int[] nums1, int m, int[] nums2, int n) {
        int[] nums1_backup = new int[m];
        System.arraycopy(nums1, 0, nums1_backup, 0, m);

        int iM = 0;
        int iN = 0;

        int i = 0;
        while (i < m + n) {
            Integer valueM = iM < m ? nums1_backup[iM] : null;
            Integer valueN = iN < n ? nums2[iN] : null;

            if (valueM == null || valueN == null) {
                if (valueM == null) {
                    nums1[i] = valueN;
                    iN++;
                } else {
                    nums1[i] = valueM;
                    iM++;
                }
            } else if (valueM > valueN) {
                nums1[i] = valueN;
                iN++;
            } else {
                nums1[i] = valueM;
                iM++;
            }

            i++;
        }
    }
}
