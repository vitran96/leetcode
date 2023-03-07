package tech.chris.leetcode.minTime2CompleteTrips;

/**
 * Find Lower and Upper bounds
 * Then use Binary search to calculate predicted time
 * Then iterate and find new predicted time until lowerbound is >= totalTrips.
 * <p>
 * ONLINE SOLUTION!
 * Can be optimized
 */
public class Solution3 implements MinTime2CompleteTrips {
    @Override
    public long minimumTime(int[] time, int totalTrips) {
        long lowerBound = 1;
        long upperBound = Long.MAX_VALUE;

        for (int t : time) {
            lowerBound = Math.min(lowerBound, t);
            upperBound = Math.min(upperBound, t);
        }

        upperBound = totalTrips * upperBound;

        while (lowerBound < upperBound) {
            long mid = lowerBound + (upperBound - lowerBound) / 2;
            long count = 0;
            for (int t : time) {
                count += mid / t;
            }

            if (count >= totalTrips) {
                upperBound = mid;
            } else if (count < totalTrips) {
                lowerBound = mid + 1;
            }
        }

        return lowerBound;
    }
}
