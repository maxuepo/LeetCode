package net.xuepo.algorithm;

/**
 * Created by xuepo on 3/26/17.
 */
public class MaximumGap {
    public int maximumGap(int[] nums) {
        if(nums == null || nums.length < 2) return 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : nums) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        int interval = (int)Math.ceil((double)(max - min) / (nums.length - 1));
        if(interval == 0) interval = 1;
        int numOfBuckets = (max - min) / interval + 1;

        Bucket[] buckets = new Bucket[numOfBuckets];
        for(int i = 0; i < buckets.length; i++) {
            buckets[i] = new Bucket();
        }

        for(int i : nums) {
            int idx = (i - min) / interval;
            buckets[idx].max = Math.max(i, buckets[idx].max);
            buckets[idx].min = Math.min(i, buckets[idx].min);
        }

        int prev = buckets[0].max;
        int res = 0;
        for(int i = 0; i < buckets.length; i++) {
            if(prev != Integer.MIN_VALUE && buckets[i].min != Integer.MAX_VALUE) {
                res = Math.max(buckets[i].min - prev, res);
                prev = buckets[i].max;
            }
        }
        return res;
    }

    class Bucket {
        public int max = Integer.MIN_VALUE;
        public int min = Integer.MAX_VALUE;
        public Bucket() {
            this.max = Integer.MIN_VALUE;
            this.min = Integer.MAX_VALUE;
        }
    }
}

