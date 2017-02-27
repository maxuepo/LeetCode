package net.xuepo.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by xuepo on 2/26/17.
 */
public class OnesAndZeroes {
    private int count = 0;
    public int findMaxForm(String[] strs, int m, int n) {
        count = 0;
        Map<String, Integer> mp = createMap(strs);
        helper(strs, m, n, new HashSet<>(), mp, 0);
        return count;
    }

    private int countOnes(String str) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '1') count++;
        }
        return count;
    }

    private Map<String, Integer> createMap(String[] strs) {
        Map<String, Integer> mp = new HashMap<>();
        for(String str : strs) {
            int ones = countOnes(str);
            mp.put(str, ones);
        }
        return mp;
    }

    private void helper(String[] strs, int m, int n, Set<String> visited, Map<String, Integer> mp,  int tempCount) {
        if (m < 0 || n < 0) return;
        if (m == 0 && n == 0) return;
        count = Math.max(tempCount + 1, count);
        for(int i = 0; i < strs.length; i++) {
            String str = strs[i];
            if(visited.contains(str)) continue;
            visited.add(str);
            int ones = mp.get(str);
            int zeros = str.length() - ones;
            helper(strs, m - ones, n - zeros, visited, mp, tempCount + 1);
            visited.remove(str);
        }
    }
}
