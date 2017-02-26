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
        int m = equations.length;
        Map<String, Double> mp = new HashMap<>();
        Set<String> set = new HashSet<>();

        for(int i = 0; i < equations.length; i++) {

            mp.put(equations[i][0] + equations[i][1], values[i]);
            mp.put(equations[i][1] + equations[i][0], 1 / values[i]);
            set.add(equations[i][0]);
            set.add(equations[i][1]);

        }
        for(int i = 0; i < m - 1; i++) {
            for(int j = i + 1; j < m; j++) {
                if(equations[i][0].equals(equations[j][0])) {
                    mp.put(equations[i][1] + equations[j][1], values[j] / values[i]);
                    mp.put(equations[j][1] + equations[i][1], values[i] / values[j]);
                }

                if(equations[i][0].equals(equations[j][1])) {
                    mp.put(equations[i][1] + equations[j][0], values[j] * values[i]);
                    mp.put(equations[j][0] + equations[i][1], 1 / (values[i] * values[j]));
                }

                if(equations[i][1].equals(equations[j][0])) {
                    mp.put(equations[i][0] + equations[j][1], values[i] * values[j]);
                    mp.put(equations[j][1] + equations[i][0], 1 / (values[j] / values[i]));
                }

                if(equations[i][1].equals(equations[j][1])) {
                    mp.put(equations[i][0] + equations[j][0], values[i] / values[j]);
                    mp.put(equations[j][0] + equations[i][0], values[i] / values[j]);
                }
            }
        }

        int n = queries.length;
        double[] res = new double[n];
        int index = 0;
        for(String[] entry : queries) {
            String temp = entry[0] + entry[1];
            if(mp.containsKey(temp)){
                res[index] = mp.get(temp);
            } else if (entry[0].equals(entry[1]) && set.contains(entry[0])){
                res[index] = 1.0;
            } else {
                res[index] = -1.0;
            }
            index++;
        }
        return res;
    }
}
