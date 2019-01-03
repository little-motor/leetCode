package cn.littlemotor.LinkedList;

/**
 * #203
 *
 * Remove all elements from a linked list of integers that have value val.
 *
 * Example:
 *
 * Input:  1->2->6->3->4->5->6, val = 6
 * Output: 1->2->3->4->5
 * 算法思想：首先判断头节点是否为空或者等于val，之后判断后继节点，相同的话改变他们的next
 * 时间复杂度O(n),空间复杂度O(n)
 * @author littlemotor
 * @date 19.1.3
 */
public class RemoveLinkedListElements203 {

    public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
    }

    public ListNode removeElements(ListNode head, int val) {

        while(head != null && head.val == val){
            head = head.next;
        }
        ListNode current = head;
        while(current != null && current.next != null){
            if(current.next.val == val){
                current.next = current.next.next;
                continue;
            }
            current = current.next;
        }
        return head;
    }
}
