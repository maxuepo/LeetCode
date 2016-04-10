package net.xuepo.algorithm;


import java.util.Arrays;
/**
 * Created by xuepo on 4/10/16.
 */
public class WiggleSortII {
    public void wiggleSort(int[] nums) {

        int n = nums.length;
        Arrays.sort(nums);
        int[] res = new int[nums.length];

        int left = (n - 1) / 2;
        int right = n - 1;


        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                res[i] = nums[left];
                left--;
            } else {
                res[i] = nums[right];
                right--;
            }
        }

        for(int i = 0; i < n; i++) {
            nums[i] = res[i];
        }
    }
}
