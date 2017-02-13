package net.xuepo.algorithm;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
/**
 * Created by xuepo on 2/12/17.
 */
public class SortCharactersByFrequencyTest extends SortCharactersByFrequency {

    @Test
    public void frequencySortTest() {
        String str01 = "tree";
        String outstr01 = frequencySort(str01);
        System.out.println(outstr01);
    }


}
