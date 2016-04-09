package net.xuepo.algorithm;

import java.util.Stack;

/**
 * Created by xuepo on 4/9/16.
 */
public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {

        Stack<String> stack = new Stack<>();


        for (String token : tokens) {
            if (token.equals("+")) {
                int n1 = Integer.parseInt(stack.pop());
                int n2 = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(n1 + n2));
            } else if (token.equals("-")) {
                int n1 = Integer.parseInt(stack.pop());
                int n2 = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(n2 - n1));
            } else if (token.equals("*")) {
                int n1 = Integer.parseInt(stack.pop());
                int n2 = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(n2 * n1));
            } else if (token.equals("/")) {
                int n1 = Integer.parseInt(stack.pop());
                int n2 = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(n2 / n1));
            } else {
                stack.push(token);
            }
        }

        return Integer.parseInt(stack.pop());
    }
}
