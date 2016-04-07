package net.xuepo.algorithm;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by xuepo on 4/7/16.
 */
public class NumArrayTest {
    @Test
    public void testSumRange() throws Exception {


        int[] nums = {1,3,4,6};
        NumArray na = new NumArray(nums);

        assertEquals(na.sumRange(0, 3), 14);
        assertEquals(na.sumRange(1, 2), 7);

        // nums becoms {1,4,4,6}
        na.update(1, 4);
        assertEquals(na.sumRange(1, 2), 8);
        assertEquals(na.sumRange(2, 3), 10);

    }

}