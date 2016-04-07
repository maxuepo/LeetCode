#  Range Sum Query - Mutable
Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

The update(i, val) function modifies nums by updating the element at index i to val.
Example:
Given nums = [1, 3, 5]

sumRange(0, 2) -> 9
update(1, 2)
sumRange(0, 2) -> 8
Note:
The array is only modifiable by the update function.
You may assume the number of calls to update and sumRange function is distributed evenly.
# Solution

to be updated.

# code

```java
public class NumArray {

    private int[] numsCopy;
    private int[] bit;

    int lowerbit(int val) {
        return val & (-val);
    }

    int query(int i) {
        i++;
        int sum = 0;
        while(i > 0) {
            sum += bit[i];
            i -= lowerbit(i);
        }
        return sum;
    }

    void add(int i, int val) {
        i++;
        while (i < bit.length) {
            bit[i] += val;
            i += lowerbit(i);
        }
    }

    public NumArray(int[] nums) {

        numsCopy = new int[nums.length];
        for(int i = 0; i < nums.length; i++) numsCopy[i] = nums[i];
        bit = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            add(i, nums[i]);
        }
    }

    void update(int i, int val) {
        if (val != numsCopy[i]) {
            add(i, val - numsCopy[i]);
            numsCopy[i] = val;
        }
    }

    public int sumRange(int i, int j) {
        return query(j) - query(i - 1);
    }


}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.update(1, 10);
// numArray.sumRange(1, 2);
```