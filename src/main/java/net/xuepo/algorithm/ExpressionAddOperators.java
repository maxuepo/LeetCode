package net.xuepo.algorithm;


import java.util.List;
import java.util.ArrayList;
/**
 * Created by xuepo on 4/9/16.
 */
public class ExpressionAddOperators {

    public List<String> addOperators(String num, int target) {
        List<String> res = new ArrayList<>();
        helper(num, target, "", 0, 0, res);
        return res;
    }


    private void helper(String num, int target, String expr, long currRes, long prevNum, List<String> res) {
        if (num.length() == 0 && currRes == target) {
            String finalRes = new String(expr);
            res.add(finalRes);
            return;
        }
        for (int i = 1; i <= num.length(); i++) {
            String tmp = num.substring(0, i);
            if (tmp.length() > 1 && tmp.charAt(0) == '0') {
                return;
            }
            long currNum = Long.parseLong(tmp);
            String next = num.substring(i);
            if (expr.length() != 0) {
                helper(next, target, expr + "*" + currNum, currRes - prevNum + currNum * prevNum, currNum * prevNum, res);
                helper(next, target, expr + "+" + currNum, currRes + currNum, currNum, res);
                helper(next, target, expr + "-" + currNum, currRes - currNum, -currNum, res);
            } else {
                helper(next, target, tmp, currNum, currNum, res);
            }
        }
    }
}
