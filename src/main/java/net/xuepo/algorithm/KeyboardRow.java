package net.xuepo.algorithm;

import java.util.*;

/**
 * Created by xuepo on 2/7/17.
 */
public class KeyboardRow {
    public String[] findWords(String[] words) {
        Set<Character> topLine = toCharSet("qwertyuiop");
        Set<Character> midLine = toCharSet("asdfghjkl");
        Set<Character> bottomLine = toCharSet("zxcvbnm");
        List<String> res = new ArrayList<>();
        for(String word : words) {
            int inTopLine = 0;
            int inMidLine = 0;
            int inBottomLine = 0;
            for(char c : word.toCharArray()) {
                if(topLine.contains(Character.toLowerCase(c))) inTopLine = 1;
                if(midLine.contains(Character.toLowerCase(c))) inMidLine = 1;
                if(bottomLine.contains(Character.toLowerCase(c))) inBottomLine = 1;
            }
            int sum = inTopLine + inMidLine + inBottomLine;
            if(sum == 1) res.add(word);
        }
        return toStringArray(res);
    }

    String[] toStringArray(List<String> list) {
        String[] output = new String[list.size()];
        for(int i = 0; i < output.length; i++) {
            output[i] = list.get(i);
        }
        return output;
    }

    private Set<Character> toCharSet(String str) {
        Set<Character> res = new HashSet<>();
        for(char c : str.toCharArray()) {
            res.add(c);
        }
        return res;
    }
}