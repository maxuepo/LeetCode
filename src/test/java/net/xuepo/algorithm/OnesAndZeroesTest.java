package net.xuepo.algorithm;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
/**
 * Created by xuepo on 2/26/17.
 */
public class OnesAndZeroesTest extends OnesAndZeroes {

    @Test
    public void findMaxFormTest() {
        String[] input01 = {"10", "0001", "111001", "1", "0"};
        int m01 = 5;
        int n01 = 3;
        int out01 = findMaxForm(input01, m01, n01);
        System.out.println(out01);

        String[] input02 = {"10","0","1"};
        int m02 = 1;
        int n02 = 1;
        int out02 = findMaxForm(input02, m02, n02);
        System.out.println(out02);

    }



}
