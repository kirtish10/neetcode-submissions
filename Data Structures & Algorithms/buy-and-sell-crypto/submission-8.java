class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int max_profit = 0;
        while(r < prices.length ) {
            if(prices[l] < prices[r]) {
                max_profit = Math.max(max_profit, prices[r] - prices[l]);
            } else {
                l = r;
            }
            r++;
        }

        return max_profit;
    }
}
