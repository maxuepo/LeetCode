package net.xuepo.algorithm;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

/**
 * Created by xuepo on 4/10/16.
 */
public class WiggleSortIITest extends WiggleSortII{
    @Test
    public void testWiggleSort() throws Exception {
        int[] nums = {1,5,1,1,4,6};
        wiggleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

}