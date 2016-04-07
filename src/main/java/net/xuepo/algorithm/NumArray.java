package net.xuepo.algorithm;

/**
 * Created by xuepo on 4/6/16.
 */
public class NumArray {
    private int[] numsCopy;
    private int[] bit;

    int lowerbit(int val) {
        return val & (-val);
    }

    int query(int i) {
        i++;
        int sum = 0;
        while(i > 0) {
            sum += bit[i];
            i -= lowerbit(i);
        }
        return sum;
    }

    void add(int i, int val) {
        i++;
        while (i < bit.length) {
            bit[i] += val;
            i += lowerbit(i);
        }
    }

    public NumArray(int[] nums) {
        numsCopy = new int[nums.length];
        for(int i = 0; i < nums.length; i++) numsCopy[i] = nums[i];
        bit = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            add(i, nums[i]);
        }
    }

    void update(int i, int val) {
        if (val != numsCopy[i]) {
            add(i, val - numsCopy[i]);
            numsCopy[i] = val;
        }
    }

    public int sumRange(int i, int j) {
        return query(j) - query(i - 1);
    }
}
