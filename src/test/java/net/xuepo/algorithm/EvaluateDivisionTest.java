package net.xuepo.algorithm;

import org.junit.Assert;
import org.testng.annotations.Test;
/**
 * Created by xuepo on 2/23/17.
 */
public class EvaluateDivisionTest extends EvaluateDivision {

    @Test
    public void calcEquationTest() {

        /**
         * equations = [ ["a", "b"], ["b", "c"] ],
         values = [2.0, 3.0],
         queries = [ ["a", "c"], ["b", "a"], ["a", "e"], ["a", "a"], ["x", "x"] ].
         */

        String[][] eq01 = {{"a", "b"}, {"b", "c"}};
        double[] val01 = {2.0, 3.0};
        String[][] q01 = {{"a", "c"}, {"b", "a"}, {"a", "e"}, {"a", "a"}, {"x", "x"}};

        double[] res01 = calcEquation(eq01, val01, q01);

        for(double v : res01) {
            System.out.println(v);
        }

    }



}
