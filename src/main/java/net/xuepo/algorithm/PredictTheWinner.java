package net.xuepo.algorithm;


/**
 * Created by xuepo on 2/18/17.
 */
public class PredictTheWinner {

    public boolean PredictTheWinner(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        int s1 = 0;
        int s2 = 0;

        boolean player1 = true;
        while(i <= j) {

            if(player1) {
                if(nums[i] >= nums[j]) {
                    s1 += nums[i];
                    i++;
                } else{
                    s1 += nums[j];
                    j--;
                }
                player1 = false;
            } else {
                if(nums[i] >= nums[j]) {
                    s2 += nums[i];
                    i++;
                } else {
                    s2 += nums[j];
                    j--;
                }
                player1 = true;
            }
        }

        System.out.println("s1: " + s1 + "; " + "s2: " + s2);
        return s1 >= s2 ? true : false;
    }
}
