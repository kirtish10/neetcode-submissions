class Solution {
    public int maxProfit(int[] prices) {

        if(prices.length < 2) return 0 ;

        int l = 0;
        int r = 1;
        int max_profit = 0;
    
        while(r < prices.length) {

            if(prices[l] > prices[r]) {
                l=r;
            } else {
                max_profit  = Math.max(max_profit, prices[r] - prices[l]);
                r++;
            }
        }

        return max_profit;
    }
}
