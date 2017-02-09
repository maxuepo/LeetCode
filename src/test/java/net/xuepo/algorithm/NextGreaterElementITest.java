package net.xuepo.algorithm;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
/**
 * Created by xuepo on 2/8/17.
 */
public class NextGreaterElementITest extends NextGreaterElementI {

    @Test
    public void nextGreaterElementTest() {
        int[] nums1 = {4,1,2}; int[] nums2 = {1,3,4,2};
        int[] res = this.nextGreaterElement(nums1, nums2);
        for(int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
