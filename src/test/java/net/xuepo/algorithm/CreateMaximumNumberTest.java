package net.xuepo.algorithm;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

/**
 * Created by xuepo on 4/12/16.
 */
public class CreateMaximumNumberTest extends CreateMaximumNumber {

    @Test
    public void testMaxNumber() throws Exception {

        int[] nums1 = {3, 9};
        int[] nums2 = {9, 8, 9, 2, 7};
        int k = 3;

        int[] res = getMaxSubArray(nums2, 3);

        System.out.println(Arrays.toString(res));
    }

}