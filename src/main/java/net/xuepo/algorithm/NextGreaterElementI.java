package net.xuepo.algorithm;

/**
 * Created by xuepo on 2/8/17.
 */
public class NextGreaterElementI {
    //TODO: find a more efficient algorithm.
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] res = new int[findNums.length];
        int j = 0;
        for(int num : findNums) {
            boolean toggle = false;
            int target = -1;
            for(int i = 0; i < nums.length; i++) {
                if(toggle == true || num == nums[i]) {
                    if(num == nums[i]) toggle = true;
                    if(num < nums[i]) {
                        target = nums[i];
                    }
                }
            }
            res[j++] = target;
        }
        return res;
    }
}
