package tech.chris.leetcode.minTime2CompleteTrips;

/**
 * You are given an array time where time[i] denotes the time taken by the i^th bus to complete one trip.
 * Each bus can make multiple trips successively; that is, the next trip can start immediately after completing the current trip. Also, each bus operates independently; that is, the trips of one bus do not influence the trips of any other bus.
 * You are also given an integer totalTrips, which denotes the number of trips all buses should make in total. Return the minimum time required for all buses to complete at least totalTrips trips.
 * <p>
 * Constraint:
 * * 1 <= time.length <= 10^5
 * * 1 <= time[i], totalTrips <= 10^7
 */
public interface MinTime2CompleteTrips {
    long minimumTime(int[] time, int totalTrips);
}
