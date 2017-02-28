package net.xuepo.algorithm;

import java.util.Stack;

/**
 * Created by xuepo on 2/27/17.
 */
public class AddTwoNumbersII {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Stack<ListNode> listNodeStack1 = new Stack<>();
        Stack<ListNode> listNodeStack2 = new Stack<>();

        int count1 = 0;
        while(l1 != null) {
            listNodeStack1.push(l1);
            count1++;
            l1 = l1.next;
        }

        int count2 = 0;

        while(l2 != null) {
            listNodeStack2.push(l2);
            count2++;
            l2 = l2.next;
        }


        Stack<ListNode> largerStack = count1 >= count2 ? listNodeStack1 : listNodeStack2;
        Stack<ListNode> smallerStack = count1 < count2 ? listNodeStack1 : listNodeStack2;

        int carry = 0;
        ListNode n1 = null;
        ListNode n2 = null;
        while(!smallerStack.isEmpty()) {
            n1 = largerStack.pop();
            n2 = smallerStack.pop();
            int sum = n1.val + n2.val + carry;
            int value = sum % 10;
            carry = sum / 10;
            n1.val = value;
        }

        while(!largerStack.isEmpty()) {
            n1 = largerStack.pop();
            int sum = n1.val + carry;
            int value = sum % 10;
            carry = sum / 10;
            n1.val = value;
        }

        ListNode head = null;
        if(carry == 1) {
            head = new ListNode(1);
            head.next = n1;
        } else {
            head = n1;
        }
        return head;
    }
}
