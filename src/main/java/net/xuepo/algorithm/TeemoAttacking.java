package net.xuepo.algorithm;


/**
 * Created by xuepo on 2/9/17.
 */
public class TeemoAttacking {

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries == null || timeSeries.length == 0) return 0;
        if(timeSeries.length == 1) return duration;
        int accumulatedTime = 0;
        for(int i = 1; i < timeSeries.length; i++) {
            int delta = timeSeries[i] - timeSeries[i - 1];
            if(delta < duration) {
                accumulatedTime += delta;
            } else {
                accumulatedTime += duration;
            }
        }
        accumulatedTime += duration;
        return accumulatedTime;
    }
}
