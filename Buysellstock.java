class Solution {
    public int maximumProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // If current price is lower, update minPrice (buying price)
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                // Check if selling today gives better profit
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }      

        return maxProfit;
    }
}
