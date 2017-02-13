package net.xuepo.algorithm;

import java.util.*;

/**
 * Created by xuepo on 2/12/17.
 */
public class SortCharactersByFrequency {
    public String frequencySort(String s) {

        Map<Character, Integer> mp = new HashMap<>();

        for(char c : s.toCharArray()) {
            if(mp.containsKey(c)) {
                mp.put(c, mp.get(c) + 1);
            } else {
                mp.put(c, 1);
            }
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(new Comparator<Map.Entry<Character, Integer>>(){
            @Override
            public int compare(Map.Entry<Character, Integer> e1, Map.Entry<Character, Integer> e2) {
                return e2.getValue() - e1.getValue();
            }}
        );
        pq.addAll(mp.entrySet());
        StringBuffer sb = new StringBuffer();

        while(!pq.isEmpty()){
            Map.Entry<Character, Integer> e = pq.poll();
            for(int i = 0; i < e.getValue(); i++) {
                sb.append(e.getKey());
            }
        }
        return sb.toString();
    }
}
