package Easy.T83;

/**
 * @Title: 83. Remove Duplicates from Sorted List
 * @Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
 * @Difficulty: Easy
 * @Author: 言曌
 * @Date: 2017/11/15
 * @Time: 上午10:24
 */


//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {

    /**
     * 描述：删除链表中重复的值
     * 如输入 1->2->2->3 返回 1->2->3
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode currentNode = head;
        while(currentNode != null && currentNode.next != null) {
            if(currentNode.val == currentNode.next.val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }
        return head;
    }

    /**
     * 测试示例
     * @param args
     */
    public static void main(String args[]) {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(3);
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;

        //删除重复值之前
        ListNode current = head;
        while(current.next != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.print(current.val);//最后一个
        System.out.println();

        //删除重复值之后
        head = solution.deleteDuplicates(head);
        ListNode current2 = head;
        while(current2.next != null) {
            System.out.print(current2.val + " ");
            current2 = current2.next;
        }
        System.out.print(current2.val);//最后一个
    }
}
