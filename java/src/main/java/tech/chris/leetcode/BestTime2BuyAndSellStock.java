package tech.chris.leetcode;

// You are given an array prices where prices[i] is the price of a given stock on the ith day.
// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the
// future to sell that stock.
// Return the maximum profit you can achieve from this transaction.
// If you cannot achieve any profit, return 0.
//
// 1 <= prices.length <= 10^5
// 0 <= prices[i] <= 10^4
public class BestTime2BuyAndSellStock {
    public int maxProfit (int[] prices) {
        int iBuy = 0;
        int iSell = 0;
//        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[iBuy]) {
                iBuy = i;
                iSell = i;
            } else if (prices[i] > prices[iSell]) {
                iSell = i;
            }
        }

        return iBuy >= iSell ? 0 : prices[iSell] - prices[iBuy];
    }
}
