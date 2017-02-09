package net.xuepo.algorithm;

import java.util.Arrays;

/**
 * Created by xuepo on 2/8/17.
 */
public class RelativeRank {

    public String[] findRelativeRanks(int[] nums) {
        String[] res = new String[nums.length];
        IndexedNum[] indexedNums = new IndexedNum[nums.length];
        for(int i = 0; i < nums.length; i++) {
            indexedNums[i] = new IndexedNum(nums[i], i);
        }
        Arrays.sort(indexedNums);
        for(int i = 0; i < indexedNums.length; i++) {
            int index = indexedNums[i].y;
            if(i == 0) {
                res[index] = "Gold Medal";
            } else if(i == 1) {
                res[index] = "Silver Medal";
            } else if(i == 2) {
                res[index] = "Bronze Medal";
            } else {
                res[index] = (i + 1) + "";
            }
        }
        return res;
    }

    public IndexedNum[] toIndexNums(int[] nums) {
        IndexedNum[] indexedNums = new IndexedNum[nums.length];
        for(int i = 0; i < nums.length; i++) {
            indexedNums[i] = new IndexedNum(nums[i], i);
        }
        return indexedNums;
    }

    class IndexedNum implements Comparable<IndexedNum> {
        public int x;
        public int y;

        public IndexedNum(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(IndexedNum p) {
            return p.x - this.x;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }
}
