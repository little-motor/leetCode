package cn.littlemotor.LinkedList;

import java.util.ArrayList;
import java.util.List;

/**
 * #206
 * 
 * Reverse a singly linked list.
 *
 * Example:
 *
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 *
 * @author littlemotor
 * @date 18.12.20
 */
public class ReverseLinkedList206 {

    public class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
        }
    }

    /**
     * 通过链表转数组的方式进行二次反转,时间复杂度O(n)
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        List<ListNode> list = new ArrayList<ListNode>();
        while(true) {
            list.add(head);
            if(head.next == null) break;
            head = head.next;
        }
        for(int i = list.size() - 1; i > 0; i--){
            head = list.get(i);
            head.next = list.get(i - 1);
            head = head.next;
            head.next = null;
        }
        return list.get(list.size() - 1);
    }
}
