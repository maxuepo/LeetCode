package net.xuepo.algorithm;

import java.util.*;

/**
 * Created by xuepo on 2/12/17.
 */
public class MostFrequentSubtreeSum {
    public int[] findFrequentTreeSum(TreeNode root) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        countSumFreq(root, hashMap);
        List<Integer> tmp = new ArrayList<>();

        int val = -1;
        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() >= val) {
                val = entry.getValue();
            }
        }

        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() == val) {
                tmp.add(entry.getKey());
            }
        }
        int[] res = new int[tmp.size()];
        for(int i = 0; i < tmp.size(); i++) {
            res[i] = tmp.get(i);
        }
        return res;
    }



    private int countSumFreq(TreeNode root, Map<Integer, Integer> sumFreq) {
        if(root == null) return 0;
        int sum = countSumFreq(root.left, sumFreq) + countSumFreq(root.right, sumFreq) + root.val;
        if(sumFreq.containsKey(sum)) {
            sumFreq.put(sum, sumFreq.get(sum) + 1);
        } else {
            sumFreq.put(sum, 1);
        }
        return sum;
    }
}
