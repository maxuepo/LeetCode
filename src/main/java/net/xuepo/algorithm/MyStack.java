package net.xuepo.algorithm;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by xuepo on 2/13/17.
 */
public class MyStack {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    Integer top = null;

    /** Initialize your data structure here. */
    public MyStack() {
    }

    /** Push element x onto stack. */
    public void push(int x) {

        if(top == null) {
            top = x;
        } else {
            q1.offer(top);
            top = x;
        }

    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(top == null) throw new MyStackEmptyException("The stack is empty!");
        while(q1.size() > 1) {
            q2.offer(q1.poll());
        }
        int temp = top;
        if(!q1.isEmpty()) {
            top = q1.poll();
        } else {
            top = null;
        }
        q1 = q2;
        q2 = new LinkedList<>();
        return temp;
    }

    /** Get the top element. */
    public int top() {
        return top;

    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return top == null && q1.isEmpty() && q2.isEmpty();
    }
}