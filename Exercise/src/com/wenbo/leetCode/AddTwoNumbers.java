package com.wenbo.leetCode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int flag = 0;
        ListNode node = new ListNode(0);
        ListNode p = l1, q = l2, cur = node;
        while (p != null || q != null) {
            int x = p == null ? 0 : p.val;
            int y = q == null ? 0 : q.val;
            int temp = x + y;
            cur.next = new ListNode(temp % 10 + flag);
            flag = temp > 9 ? 1 : 0;
            cur = cur.next;
            p = p.next;
            q = q.next;
        }
        if(flag>0){
            cur.next = new ListNode(flag);
        }
        return node.next;
    }
}
