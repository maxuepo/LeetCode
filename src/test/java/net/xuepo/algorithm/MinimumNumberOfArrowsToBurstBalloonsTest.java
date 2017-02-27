package net.xuepo.algorithm;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by xuepo on 2/26/17.
 */
public class MinimumNumberOfArrowsToBurstBalloonsTest extends MinimumNumberOfArrowsToBurstBalloons{

    @Test
    public void findMinArrowShotsTest(){

        int[][] input01 = {{10,16},{2,8},{1,6},{7,12}};
        int numArrows01 = findMinArrowShots(input01);
        System.out.println(numArrows01);


    }
}
