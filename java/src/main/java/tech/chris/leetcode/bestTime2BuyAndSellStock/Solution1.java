package tech.chris.leetcode.bestTime2BuyAndSellStock;

public class Solution1 implements BestTime2BuyAndSellStock {
    @Override
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;

        for (int price : prices) {
            min = Math.min(price, min);
            profit = Math.max(price - min, profit);
        }

        return profit;
    }
}
