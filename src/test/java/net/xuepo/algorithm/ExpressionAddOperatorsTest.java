package net.xuepo.algorithm;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import java.util.List;

/**
 * Created by xuepo on 4/9/16.
 */
public class ExpressionAddOperatorsTest extends ExpressionAddOperators{
    @Test
    public void testAddOperators() throws Exception {
        List<String> res = addOperators("232", 8);
        System.out.println(res);
    }
}