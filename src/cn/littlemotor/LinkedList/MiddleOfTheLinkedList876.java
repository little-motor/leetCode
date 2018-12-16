package cn.littlemotor.LinkedList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author littlemotor
 * @date 18.12.16
 *
 * #876
 *
 * Given a non-empty, singly linked list with head node head, return a middle node of linked list.
 *
 * If there are two middle nodes, return the second middle node.
 *
 *
 *
 * Example 1:
 *
 * Input: [1,2,3,4,5]
 * Output: Node 3 from this list (Serialization: [3,4,5])
 * The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
 * Note that we returned a ListNode object ans, such that:
 * ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.
 *
 * Example 2:
 *
 * Input: [1,2,3,4,5,6]
 * Output: Node 4 from this list (Serialization: [4,5,6])
 * Since the list has two middle nodes with values 3 and 4, we return the second one.
 *
 *
 *
 * Note:
 *
 *     The number of nodes in the given list will be between 1 and 100.
 */





public class MiddleOfTheLinkedList876 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    private List<ListNode> list = new ArrayList<ListNode>(100);
    private int length;

    public ListNode middleNode(ListNode head) {

        while(head != null){
            list.add(head);
            head = head.next;
        }


        length = list.size();
        //不用判奇偶，结果都是一样的
        return list.get(length / 2);

    }

    /**
     * 当用慢指针 slow 遍历列表时，让另一个指针 fast 的速度是它的两倍。
     * 当 fast 到达列表的末尾时，slow 必然位于中间。
     * class Solution {
     *     public ListNode middleNode(ListNode head) {
     *         ListNode slow = head, fast = head;
     *         while (fast != null && fast.next != null) {
     *             slow = slow.next;
     *             fast = fast.next.next;
     *         }
     *         return slow;
     *     }
     * }
     */
}
