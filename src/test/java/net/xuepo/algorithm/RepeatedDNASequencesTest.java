package net.xuepo.algorithm;

import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by xuepo on 3/5/17.
 */
public class RepeatedDNASequencesTest extends RepeatedDNASequences {
    @Test
    public void findRepeatedDnaSequencesTest() {

        List<String> res01 = findRepeatedDnaSequences("AAAAAAAAAAA");

        for(String str : res01) {
            System.out.println(str);
        }
    }
}
