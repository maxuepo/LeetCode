package net.xuepo.algorithm;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by xuepo on 4/9/16.
 */
public class LargestRectangleinHistogramTest extends LargestRectangleinHistogram{
    @Test
    public void testLargestRectangleArea() throws Exception {

        int[] input =  {2,1,5,6,2,3};

        int res =  largestRectangleArea(input);

        System.out.println(res);
    }

}