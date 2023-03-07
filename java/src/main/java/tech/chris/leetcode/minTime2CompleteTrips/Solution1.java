package tech.chris.leetcode.minTime2CompleteTrips;

import java.util.ArrayList;
import java.util.List;

/**
 * This take too long
 * Time: O(n^2)
 * Space: O(n)
 */
public class Solution1 implements MinTime2CompleteTrips {
    @Override
    public long minimumTime(int[] time, int totalTrips) {
        List<BusTrip> busTrips = new ArrayList<>(time.length);
        for (int t : time) {
            busTrips.add(new BusTrip(t));
        }

        int result = 0;
        do {
            result++;
            int finishedTrip = 0;
            for (BusTrip busTrip : busTrips) {
                busTrip.move();
                finishedTrip += busTrip.getFinishedTrip();
                if (finishedTrip >= totalTrips) {
                    break;
                }
            }

            if (finishedTrip >= totalTrips) {
                break;
            }
        } while (true);
        return result;
    }

    private final static class BusTrip {
        private final int TIME_2_FINISH;
        private int finishedTrip;
        private long timeCounter;

        public BusTrip(int TIME_2_FINISH) {
            this.TIME_2_FINISH = TIME_2_FINISH;
            finishedTrip = 0;
            timeCounter = 0;
        }

        public void move() {
            timeCounter++;
            if (timeCounter == TIME_2_FINISH) {
                timeCounter = 0;
                finishedTrip++;
            }
        }

        public int getFinishedTrip() {
            return finishedTrip;
        }
    }
}
