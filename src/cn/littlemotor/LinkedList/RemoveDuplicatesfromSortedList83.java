package cn.littlemotor.LinkedList;

/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 *
 * Example 1:
 *
 * Input: 1->1->2
 * Output: 1->2
 *
 * Example 2:
 *
 * Input: 1->1->2->3->3
 * Output: 1->2->3
 *
 * 思路：
 * 循环遍历比较与下一个节点值是否相同，相同的话跳到下下一个节点，并重新continue，如果不相同的用node=node.next;
 * 时间复杂度O(n),空间复杂度O(1)
 * @author  littlemotor
 * @date 18.12.28
 */
public class RemoveDuplicatesfromSortedList83 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x){this.val = x;}
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while (node != null && node.next != null) {
            if(node.val == node.next.val){
                node.next = node.next.next;
                continue;
            }
            node = node.next;
        }
        return head;
    }

}
