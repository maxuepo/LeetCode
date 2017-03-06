package net.xuepo.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by xuepo on 3/5/17.
 */
public class RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set = new HashSet<>();
        Set<String> repeated = new HashSet<>();
        int window = 10;
        for(int i = 0; i + window <= s.length(); i++) {
            String str = s.substring(i, i + window);
            if(set.contains(str)) {
                repeated.add(str);
            }
            set.add(str);
        }
        return new ArrayList<>(repeated);
    }
}
