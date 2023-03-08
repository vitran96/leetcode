package tech.chris.leetcode.kokoEatBananas;

public class Solution1 implements KokoEatBananas {
    @Override
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for (int n : piles) {
            r = Math.max(r, n);
        }

        // Binary search
        while (l < r) {
            int mid = (l + r) / 2;
            int hours = 0;
            for (int bananas : piles) {
                hours += bananas / mid;
                if (bananas % mid != 0) {
                    hours++;
                }
            }

            // This part I use online solution to fix :((
            if (hours <= h) { // Eat too fast
                r = mid;
            } else { // Eat too slow
                l = mid + 1;
            }
        }
        return l;
    }
}
