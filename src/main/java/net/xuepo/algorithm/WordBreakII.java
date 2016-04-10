package net.xuepo.algorithm;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by xuepo on 4/10/16.
 */
public class WordBreakII {


    public List<String> wordBreak(String s, Set<String> wordDict) {
        List<String> tmp = new ArrayList<>();
        List<String> res = new ArrayList<>();
        helper(s, wordDict, 0, tmp, res);
        return res;
    }


    private void helper(String s, Set<String> wordDict, int start, List<String> tmp, List<String> res) {
        if (start == s.length() && !tmp.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append(tmp.get(0));
            for (int i = 1; i < tmp.size(); i++) {
                sb.append(" ").append(tmp.get(i));
            }
            res.add(sb.toString());
        }

        WordBreak wb = new WordBreak();
        if (!wb.wordBreak(s.substring(start), wordDict))return;
        StringBuilder word = new StringBuilder();
        for (int i = start; i < s.length(); i++) {
            word.append(s.charAt(i));
            if (wordDict.contains(word.toString())) {
                tmp.add(word.toString());
                helper(s, wordDict, i + 1, tmp, res);
                tmp.remove(tmp.size() - 1);
            }
        }
    }
}
