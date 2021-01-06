class Solution {
    public int maxProfit(int[] prices) {
        int total = 0;
        for (int a=prices.length-1;a>=1;a--) {
            int diff = prices[a] - prices[a-1];
            if (diff > 0) {
                total += diff;
            }
        }
        return total;
    }
}