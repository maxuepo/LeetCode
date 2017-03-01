package net.xuepo.algorithm;

/**
 * Created by xuepo on 2/27/17.
 */
public class MaximumXORofTwoNumbersinanArray {


    //TODO: THIS SOLUTION WON'T PASS LARGE TEST SET.
    // NEED A SMARTER METHOD.
    public int findMaximumXOR(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i; j < nums.length; j++) {
                max = Math.max(max, nums[i] ^ nums[j]);
            }
        }
        return max;
    }

}
