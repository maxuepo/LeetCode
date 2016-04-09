package net.xuepo.algorithm;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by xuepo on 4/9/16.
 */
public class EvaluateReversePolishNotationTest extends EvaluateReversePolishNotation{
    @Test
    public void testEvalRPN() throws Exception {

        String[] a =  {"2", "1", "+", "3", "*"};
        int res = evalRPN(a);

        System.out.println(res);
    }

}