package net.xuepo.algorithm;

/**
 * Created by xuepo on 2/12/17.
 */
public class TotalHammingDistance {
    public int totalHammingDistance(int[] nums) {
        int n = nums.length;
        int total = 0;
        for(int i = 0; i < 32; i++) {
            int bitCount = 0;
            for(int entry : nums) {
                bitCount += entry >> i & 1;
            }
            total += bitCount * (n - bitCount);
        }
        return total;
    }

    /**
     * This solution didn't pass the large array.
     * public int totalHammingDistance(int[] nums) {
     *     int dist = 0;
     *     for(int i = 0; i < nums.length; i++) {
     *         for(int j = i + 1; j < nums.length; j++) {
     *             dist += countOnes(nums[i] ^ nums[j]);
     *         }
     *     }
     *     return dist;
     * }
     *
     * private int countOnes(int num) {
     *     int count = 0;
     *     while(num != 0) {
     *         num = num & (num - 1);
     *         count++;
     *     }
     *     return count;
     * }
     */
}
