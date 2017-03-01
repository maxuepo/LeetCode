package net.xuepo.algorithm;

/**
 * Created by xuepo on 2/28/17.
 */
public class LongestPalindromicSubsequence {

    public int longestPalindromeSubseq(String s) {
        int len = s.length();
        int[][] dp = new int[len][len];
        for(int i = 0; i < s.length(); i++) {
            dp[i][i] = 1;
        }

        for(int i = 2; i <= len; i++) {
            for(int j = 0; j <= len - i; j++) {
                int k = i + j - 1;
                dp[j][k] = s.charAt(j)==s.charAt(k) ? dp[j+1][k-1]+2 : Math.max(dp[j+1][k], dp[j][k-1]);
            }
        }
        return dp[0][len - 1];
    }
}
