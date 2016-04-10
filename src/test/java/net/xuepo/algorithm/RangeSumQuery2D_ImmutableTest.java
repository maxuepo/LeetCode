package net.xuepo.algorithm;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

/**
 * Created by xuepo on 4/10/16.
 */
public class RangeSumQuery2D_ImmutableTest{


    @Test
    public void testSumRegion() throws Exception {

        int[][] matrix = {
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };

        RangeSumQuery2D_Immutable instance = new RangeSumQuery2D_Immutable(matrix);

        for(int[] arry : instance.accu) {
            System.out.println(Arrays.toString(arry));
        }


        System.out.println(instance.sumRegion(2, 1, 4, 3));

    }

}