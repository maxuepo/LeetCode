package net.xuepo.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuepo on 2/12/17.
 */
public class FindAllDuplicatesInArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                res.add(index + 1);
            }
            nums[index] = -nums[index];
        }
        return res;
    }


}
