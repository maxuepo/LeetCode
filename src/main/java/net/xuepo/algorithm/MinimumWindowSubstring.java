package net.xuepo.algorithm;

/**
 * Created by xuepo on 3/17/17.
 */
public class MinimumWindowSubstring {

    public String minWindow(String s, String t) {
        int targetNum = t.length();
        int[] targetHash = new int[256];
        for(char c : t.toCharArray()) {
            targetHash[c]++;
        }

        int i = 0, j = 0;
        int sourceNum = 0;
        int minLen = Integer.MAX_VALUE;
        String minStr = "";

        for(i = 0; i < s.length(); i++) {

            if(targetHash[s.charAt(i)] > 0) {
                sourceNum++;
            }
            targetHash[s.charAt(i)]--;
            while(sourceNum >= targetNum) {
                if(minLen > i - j + 1) {
                    minLen = Math.min(minLen, i - j + 1);
                    minStr = s.substring(j, i + 1);
                }

                targetHash[s.charAt(j)]++;

                if(targetHash[s.charAt(j)] > 0) {
                    sourceNum--;
                }
                j++;
            }
        }
        return minStr;
    }
}
