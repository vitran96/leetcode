package tech.chris.leetcode.ipo;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Greedy approach
 * We sort by Profit
 */
public class Solution1 implements Ipo {
    @Override
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        ArrayList<Project> projects = new ArrayList<>(profits.length);
        for (int i = 0; i < profits.length; i++) {
            projects.add(new Project(profits[i], capital[i]));
        }
        projects.sort(Comparator.reverseOrder());

        while (k > 0) {
            if (projects.size() == 0) {
                break;
            }

            int selected = -1;
            for (int i = 0; i < projects.size(); i++) {
                if (projects.get(i).capital <= w) {
                    selected = i;
                    break;
                }
            }

            if (selected < 0) {
                break;
            }

            w += projects.remove(selected).profit;
            k--;
        }
        return w;
    }

    class Project implements Comparable<Project> {
        int profit;
        int capital;

        public Project(int profit, int capital) {
            this.profit = profit;
            this.capital = capital;
        }

        @Override
        public String toString() {
            return "Project{" +
                "profit=" + profit +
                ", capital=" + capital +
                '}';
        }

        @Override
        public int compareTo(Project o) {
            return profit - o.profit;
        }
    }
}
