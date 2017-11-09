package Easy.T21;

/**
 * @Title: 21. Merge Two Sorted Lists
 * @Link: https://leetcode.com/problems/merge-two-sorted-lists/description/
 * @Difficulty: Easy
 * @Author: 言曌
 * @Date: 2017/11/9
 * @Time: 上午11:45
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {

    /**
     * 描述：合并两个有序的链表，且新的有序链表是由前面两个链表拼接的
     * 策略：递归
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        if(l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l2.next,l1);
            return l2;
        }
    }

    /**
     * 测试示例
     * @param args
     */
    public static void main(String args[]) {
        Solution solution = new Solution();

        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(3);
        ListNode l13 = new ListNode(5);
        ListNode l14 = new ListNode(7);
        l11.next = l12;
        l12.next = l13;
        l13.next = l14;

        ListNode l21 = new ListNode(2);
        ListNode l22 = new ListNode(4);
        ListNode l23 = new ListNode(6);
        ListNode l24 = new ListNode(8);
        l21.next = l22;
        l22.next = l23;
        l23.next = l24;


        solution.mergeTwoLists(l11,l21);
        while(l11 != null) {
            System.out.print(l11.val);
            l11 = l11.next;
        }
        System.out.println();
        while(l21 != null) {
            System.out.print(l21.val);
            l21 = l21.next;
        }
    }
}
