package tech.chris.leetcode.minTime2CompleteTrips;

/**
 * If time.length == 1
 * then result = time[0] * totalTrips
 * else use formula
 * Eg: assume time.length == 3 where each item name is a, b, and c
 * result = (a*b*c*totalTrips) / (a*c + a*b + b*c)
 * <p>
 * => FAILED
 * Fraction should not be considered
 */
public class Solution2 implements MinTime2CompleteTrips {
    @Override
    public long minimumTime(int[] time, int totalTrips) {
        if (time.length == 1) {
            return (long) time[0] * totalTrips;
        }

        long[] lowerMultiplies = new long[time.length];
        long upper = totalTrips;

        for (int i = 0; i < time.length; i++) {
            upper *= time[i];
            if (i == 0) {
                lowerMultiplies[i] = time[i];
            } else {
                lowerMultiplies[i] *= time[i];
            }

            if (i + 1 == time.length) {
                lowerMultiplies[0] *= time[i];
            } else {
                lowerMultiplies[i + 1] = time[i];
            }
        }

        float lower = 0;
        for (long lowerMultiply : lowerMultiplies) {
            lower += lowerMultiply;
        }
        return (long) Math.ceil(upper / lower);
    }
}
