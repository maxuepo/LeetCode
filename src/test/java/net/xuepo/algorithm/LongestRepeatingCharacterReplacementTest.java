package net.xuepo.algorithm;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
/**
 * Created by xuepo on 2/26/17.
 */
public class LongestRepeatingCharacterReplacementTest extends LongestRepeatingCharacterReplacement {

    @Test
    public void characterReplacementTest(){

        int out01 = characterReplacement("ABAB", 1);
        System.out.println(out01);


    }


}
