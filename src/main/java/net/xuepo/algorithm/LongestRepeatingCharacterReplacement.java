package net.xuepo.algorithm;

/**
 * Created by xuepo on 2/26/17.
 */
public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        if(s == null || s.length() == 0){
            return 0;
        }
        int maxLen = 0;

        int[] cnt = new int[26];
        char[] chars = s.toCharArray();
        for(int i =0,  j = 0; i < s.length(); i++) {
            while(j < s.length()) {
                cnt[chars[j] - 'A']++;
                if(countGap(cnt) > k) {
                    cnt[chars[j] - 'A']--;
                    break;
                }
                j++;
            }

            maxLen = Math.max(j - i, maxLen);
            cnt[chars[i] - 'A']--;
        }
        return maxLen;
    }

    private int countGap(int[] charCount) {
        int sum = 0;
        int maxFreq = 0;
        for(int count : charCount) {
            sum += count;
            maxFreq = Math.max(count, maxFreq);
        }
        return sum - maxFreq;
    }

}
