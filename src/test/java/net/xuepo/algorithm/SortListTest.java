package net.xuepo.algorithm;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by xuepo on 4/3/16.
 * As the solution passed LeetCode OJ, only one test case created for debugging purpose.
 */
public class SortListTest {

    @Test
    public void testSortList() throws Exception {
        ListNode head = new ListNode(4);
        ListNode curr = head;
        curr.next = new ListNode(2);
        curr = curr.next;
        curr.next = new ListNode(5);

        SortList instance = new SortList();
        ListNode res = instance.sortList(head);

        int[] target = {2, 4, 5};
        for (int i = 0; i < 3; i++) {
            assertEquals(res.val, target[i]);
            res = res.next;
        }
    }
}