package net.xuepo.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by xuepo on 2/23/17.
 */
public class EvaluateDivision {
    /*
      Equations are given in the format A / B = k, where A and B are variables represented as strings,
      and k is a real number (floating point number). Given some queries, return the answers. If the answer does not exist, return -1.0.
        Example:
          Given a / b = 2.0, b / c = 3.0.
          queries are: a / c = ?, b / a = ?, a / e = ?, a / a = ?, x / x = ? .
          return [6.0, 0.5, -1.0, 1.0, -1.0 ].
     */
    public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
        Map<String, Map<String, Double>> numMap = new HashMap<>();
        int i = 0;
        for(String[] entry : equations) {
            updateMap(numMap, entry[0], entry[1], values[i]);
            updateMap(numMap, entry[1], entry[0], 1 / values[i]);
            i++;
        }

        int n = queries.length;
        double[] resArray = new double[n];
        i = 0;
        for(String[] query : queries) {
            Double res = handleQuery(query[0], query[1], numMap, new HashSet<>());
            resArray[i] = res == null ? -1.0 : res;
            i++;
        }

        return resArray;
    }

    private void updateMap(Map<String, Map<String, Double>> numMap, String num, String denom, double value) {
        Map<String, Double> denomMap = numMap.get(num);
        if(denomMap == null) {
            denomMap = new HashMap<>();
            numMap.put(num, denomMap);
        }
        denomMap.put(denom, value);
    }

    private Double handleQuery(String num, String denom, Map<String, Map<String, Double>> numMap, Set<String> visitedSet) {
        String numKey = num + ":" + denom;
        if(visitedSet.contains(numKey)) return null;
        if(!numMap.containsKey(num) || !numMap.containsKey(denom)) return null;
        if(num.equals(denom)) return 1.0;
        Map<String, Double> denomMap = numMap.get(num);
        visitedSet.add(numKey);
        for(String key : denomMap.keySet()) {
            Double res = handleQuery(key, denom, numMap, visitedSet);
            if(res != null) {
                return denomMap.get(key) * res;
            }
        }
        visitedSet.remove(numKey);
        return null;
    }
}
