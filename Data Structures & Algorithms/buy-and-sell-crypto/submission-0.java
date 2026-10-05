class Solution {
    public int maxProfit(int[] prices) {
        int curr = prices[0];
        int max = Integer.MIN_VALUE;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (curr > prices[i]) {
                curr = prices[i];
                profit = 0;
            }

            if (curr < prices[i]) {
                profit = prices[i] - curr;
                max = Math.max(profit, max);
            }
        }
        return max == Integer.MIN_VALUE ?  0:  max;
    }
}
