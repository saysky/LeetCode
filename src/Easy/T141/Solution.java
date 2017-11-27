package Easy.T141;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @Title: 141. Linked List Cycle
 * @Link: https://leetcode.com/problems/linked-list-cycle/description/
 * @Difficulty: Easy
 * @author 言曌
 * @date 2017/11/27 下午9:11
 */


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class Solution {

    /**
     * 描述：给定一个链表，判断该链表是否有环
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        List list = new ArrayList();
        ListNode node = head;
        while(node != null) {
            if(list.contains(node)) {
                return true;
            } else {
                list.add(node);
            }
            node = node.next;
        }
        return false;
    }
}
