package net.xuepo.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by xuepo on 3/5/17.
 */
public class IncreasingSubsequences {

    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> seq = new ArrayList<>();
        helper(set, 0, nums, seq);
        List<List<Integer>> res = new ArrayList<>(set);
        return res;
    }

    private void helper(Set<List<Integer>> set, int index, int[] nums, List<Integer> seq) {
        if(seq.size() >= 2) {
            set.add(new ArrayList<>(seq));
        }
        for(int i = index; i < nums.length; i++) {
            if(seq.size() == 0 || seq.get(seq.size() - 1) <= nums[i]) {
                seq.add(nums[i]);
                helper(set, i + 1, nums, seq);
                seq.remove(seq.size() - 1);
            }
        }
    }
}
