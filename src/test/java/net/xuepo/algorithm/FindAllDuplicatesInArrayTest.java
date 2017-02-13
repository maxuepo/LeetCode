package net.xuepo.algorithm;

import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by xuepo on 2/12/17.
 */
public class FindAllDuplicatesInArrayTest extends FindAllDuplicatesInArray {

    @Test
    public void findDuplicatesTest() {

        int[] nums01 = {5,4,6,7,9,3,10,9,5,6};

        List<Integer> res01 = findDuplicates(nums01);

        for(Integer entry : res01) {
            System.out.println(entry);
        }
    }
}
