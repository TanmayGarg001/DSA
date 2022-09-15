//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class Main6 {

    public int maxProfit(int[] prices) {//O(n),O(1)
        int max = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(prices[i], min);
            max = Math.max(max, prices[i] - min);
        }
        return max;
    }

}
