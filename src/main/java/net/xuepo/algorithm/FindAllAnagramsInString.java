package net.xuepo.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuepo on 2/12/17.
 */
public class FindAllAnagramsInString {
    //TODO: Think of an smarter solution instead of this brutal force solution.
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int len = p.length();
        for(int i = 0; i <= s.length() - len; i++) {
            String substr = s.substring(i, i + len);
            if(isAnagram(substr, p)) {
                res.add(i);
            }
        }
        return res;
    }

    private boolean isAnagram(String strA, String strB) {
        int[] charCounts = new int[26];
        for(char c : strB.toCharArray()) {
            charCounts[c - 'a']++;
        }
        for(char c : strA.toCharArray()) {
            charCounts[c - 'a']--;
            if(charCounts[c - 'a'] < 0) return false;
        }
        return true;
    }
}
