package net.xuepo.algorithm;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by xuepo on 2/13/17.
 */
public class MyStackTest extends MyStack {

    @Test
    public void myStackTest() {

        MyStack mstack = new MyStack();

        mstack.push(1);
        mstack.push(2);
        mstack.pop();
        mstack.pop();
        mstack.push(3);
        mstack.push(4);
        mstack.pop();
        mstack.pop();

        while(!mstack.empty()) {
            System.out.println(mstack.pop());
        }
        System.out.println(mstack.pop());

    }


}
