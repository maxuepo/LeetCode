package net.xuepo.algorithm;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
/**
 * Created by xuepo on 2/18/17.
 */
public class PredictTheWinnerTest extends PredictTheWinner {

    @Test
    public void PredictTheWinnerTest(){
        int[] nums01 = {1, 5, 233, 7};
        boolean res01 = PredictTheWinner(nums01);
        Assert.assertEquals(res01, true);

        int[] nums02 = {1, 5, 2};
        boolean res02 = PredictTheWinner(nums02);
        Assert.assertEquals(res02, false);
    }

}
