package net.xuepo.algorithm;

/**
 * Created by xuepo on 4/9/16.
 */
public class BestTimeToBuyandSellStock_IV {

    public int maxProfit(int k, int[] prices) {
        if(prices.length == 0 || prices.length == 1) return 0;

        int n = prices.length;
        if (k >= n) return maxProfit2(prices);
        int[][] local = new int[n][k + 1];
        int[][] global = new int[n][k + 1];

        for (int i = 1; i < n; i++) {
            int diff = prices[i] - prices[i - 1];
            for (int j = 1; j <= k; j++) {
                local[i][j] = Math.max(global[i - 1][j - 1] + Math.max(0, diff), local[i - 1][j] + diff);
                global[i][j] = Math.max(global[i - 1][j], local[i][j]);
            }
        }
        return global[n - 1][k];
    }

    private int maxProfit2(int[] prices) {
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[i - 1] > 0) {
                sum += prices[i] - prices[i - 1];
            }
        }
        return sum;
    }
}
