package net.xuepo.algorithm;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
/**
 * Created by xuepo on 2/9/17.
 */
public class TeemoAttackingTest extends TeemoAttacking {

    @Test
    public void findPoisonedDurationTest() {

        int[] timeSeries = {1, 2};
        int duration = 2;

        int accumulatedTime = findPoisonedDuration(timeSeries, duration);
        System.out.println(accumulatedTime);

    }
}
