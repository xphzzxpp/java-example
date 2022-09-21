package com.example.javaexample.leetcode;

/**
 * @author mw
 * @date 2022/9/16
 */
public class Code2 {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();

        ListNode2 l1 = new ListNode2(2);
        l1.next = new ListNode2(4);
        ListNode2 l2 = l1.next;
        l2.next = new ListNode2(3);

        ListNode2 l3 = new ListNode2(5);
        l3.next = new ListNode2(6);
        ListNode2 l4 = l3.next;
        l4.next = new ListNode2(4);
        ListNode2 listNode2 = solution2.addTwoNumbers(l1, l3);
        System.out.println(listNode2);
    }
}


// * Definition for singly-linked list.
class ListNode2 {
    int val;
    ListNode2 next;

    ListNode2() {
    }

    ListNode2(int val) {
        this.val = val;
    }

    ListNode2(int val, ListNode2 next) {
        this.val = val;
        this.next = next;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution2 {
    public ListNode2 addTwoNumbers(ListNode2 l1, ListNode2 l2) {
        ListNode2 pre = new ListNode2(0);
        ListNode2 cur = pre;
        int carry = 0;
        while(l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;

            carry = sum / 10;
            sum = sum % 10;
            cur.next = new ListNode2(sum);

            cur = cur.next;
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
        }
        if(carry == 1) {
            cur.next = new ListNode2(carry);
        }
        return pre.next;
    }
}
