package net.xuepo.algorithm;

import java.util.Arrays;

/**
 * Created by xuepo on 2/15/17.
 * You are given a list of non-negative integers, a1, a2, ..., an, and a target, S.
 * Now you have 2 symbols + and -. For each integer, you should choose one from + and - as its new symbol.
 * Find out how many ways to assign symbols to make sum of integers equal to target S.
 */
// TODO: This is a brutal force solutions. Computation complexity, O(2^n); Try to come up with some smarter solution.
public class TargetSum {
    private int count = 0;

    public int findTargetSumWays(int[] nums, int S) {
        helper(nums, S, 0);
        return count;
    }

    private void helper(int[] nums, int s, int index) {
        if(index >= nums.length) return;
        if(index == nums.length - 1) {
            if(s == -nums[index]) {
                count++;
            }
            if(s == nums[index]) {
                count++;
            }
            return;
        }
        helper(nums, s + nums[index], index + 1);
        helper(nums, s - nums[index], index + 1);
        return;
    }
}
