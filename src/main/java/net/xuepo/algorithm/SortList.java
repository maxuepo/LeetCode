package net.xuepo.algorithm;

/**
 * Created by xuepo on 4/3/16.
 */

public class SortList {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = slow.next;
        slow.next = null;

        slow = sortList(head);
        fast = sortList(fast);

        head = merge(slow, fast);
        return head;
    }


    private ListNode merge(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode head = new ListNode(0);
        ListNode curr = head;

        while (l1 != null && l2 != null) {

            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        if (l1 != null) curr.next = l1;
        if (l2 != null) curr.next = l2;

        return head.next;
    }
}
