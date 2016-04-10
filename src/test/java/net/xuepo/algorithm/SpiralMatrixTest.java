package net.xuepo.algorithm;

import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by xuepo on 4/9/16.
 */
public class SpiralMatrixTest extends SpiralMatrix{
    @Test
    public void testSpiralOrder() throws Exception {


        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


        List<Integer> res = this.spiralOrder(input);

        System.out.println(res);

    }

}