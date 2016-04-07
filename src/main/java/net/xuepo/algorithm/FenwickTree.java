package net.xuepo.algorithm;

import java.util.Arrays;

/**
 * Created by xuepo on 4/6/16.
 */
public class FenwickTree {
    int capacity;
    int[] fTree;

    /**
     * create an Empty Fenwick tree;
     */
    FenwickTree() {
        this.capacity = 0;
        this.fTree = new int[0];
    }

    /**
     * Construct Fenwick tree of size capacity which all elements equal to 0.
     * Note that there is dummy node at position 0, so the actual size of
     * Fenwick tree is capacity + 1.
     * @param capacity capacity of fenwick tree.
     */
    public FenwickTree(int capacity) {
        this.capacity = capacity;
        fTree = new int[capacity + 1];
    }

    /**
     * Construct Fenwick tree from array.
     * @param array input arry.
     */
    public FenwickTree(int[] array) {
        for (int i = 0; i < array.length; i++) {
            update(i, array[i]);
        }
        this.capacity = array.length;
    }

    /**
     * get the lowest position of "1" in binary representation of input x.
     * e.g. 6's binaray representation is 110, and its lowest "1" is at postion 2. So this method returns
     * 2 for input 6.
     * @param x input integer.
     * @return the lowest position of "1"
     */
    public int lowbit(int x) {
        return x & (-x);
    }

    /**
     * @param n index n.
     * @return  sum from index 0 to index n.
     */
    public int sum(int n) {
        int sum = 0;
        while(n > 0) {
            sum += fTree[n];
            n = n - lowbit(n);
        }
        return sum;
    }

    /**
     * @param index the index to update.
     * @param val the value to update.
     */
    void update(int index, int val) {
        index++;
        while(index <= capacity) {
            fTree[index] += val;
            index += lowbit(index);
        }
    }
}
