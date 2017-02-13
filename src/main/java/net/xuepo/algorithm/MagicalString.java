package net.xuepo.algorithm;

import java.util.Arrays;

/**
 * Created by xuepo on 2/12/17.
 */
public class MagicalString {
    public int magicalString(int n) {
        if(n <= 0) return 0;
        if(n <= 2) return 1;
        int[] nums = new int[n];
        nums[0] = 1;
        nums[1] = 2;

        int index = 1;
        int i = 1;
        boolean one = false;

        while(index < n) {
            int numOfRepeat = nums[i];
            for(int j = 0; j < numOfRepeat && index < n; j++) {
                nums[index] = one ? 1 : 2;
                index++;
            }
            i++;
            one = !one;
        }
        int res = 0;
        for(int entry : nums) {
            if(entry == 1) res += entry;
        }
        return res;
    }
}
