package net.xuepo.algorithm;

import java.util.*;

/**
 * Created by xuepo on 2/26/17.
 */
public class MinimumNumberOfArrowsToBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        if(points == null || points.length == 0 || points[0].length == 0) return 0;
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        });
        int count = 1;
        int arrowLimit = points[0][1];
        for(int i = 1; i < points.length; i++) {

            int[] balloon = points[i];

            if(arrowLimit >= balloon[0]) {
                arrowLimit = Math.min(arrowLimit, balloon[1]);
            } else {
                count++;
                arrowLimit = balloon[1];
            }
        }
        return count;
    }
}
