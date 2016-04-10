package net.xuepo.algorithm;


import java.util.Set;
/**
 * Created by xuepo on 4/10/16.
 */
public class WordBreak {
    public boolean wordBreak(String s, Set<String> wordDict) {
        int n = s.length();

        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int k = 0; k <= i; k++) {
                dp[i] = dp[k] && wordDict.contains(s.substring(k, i));
                if(dp[i]) break;
            }
        }
        return dp[n];
    }
}
