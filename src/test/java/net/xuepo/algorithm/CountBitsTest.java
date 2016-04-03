package net.xuepo.algorithm;

import org.testng.annotations.Test;
import java.util.Arrays;
import static org.testng.Assert.*;

/**
 * Created by xuepo on 4/3/16.
 */
public class CountBitsTest {
    int[] expected_2 = {0,1,1};
    int[] expected_10 = {0,1,1,2,1,2,2,3,1,2,2};


    @Test
    public void testCountBits() throws Exception {
        CountBits instance = new CountBits();
        int[] res_10 = instance.countBits(10);
        int[] res_2  = instance.countBits(2);
        assertTrue(Arrays.equals(res_2, expected_2));
        assertTrue(Arrays.equals(res_10, expected_10));
    }

}