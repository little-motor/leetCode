package cn.littlemotor.LinkedList;

/**
 * @author littlemotor
 * @date 18.12.15
 *
 *  #237
 *
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 *
 * Given linked list -- head = [4,5,1,9], which looks like following:
 *
 *     4 -> 5 -> 1 -> 9
 *
 * Example 1:
 *
 * Input: head = [4,5,1,9], node = 5
 * Output: [4,1,9]
 * Explanation: You are given the second node with value 5, the linked list
 *              should become 4 -> 1 -> 9 after calling your function.
 *
 * Example 2:
 *
 * Input: head = [4,5,1,9], node = 1
 * Output: [4,5,9]
 * Explanation: You are given the third node with value 1, the linked list
 *              should become 4 -> 5 -> 9 after calling your function.
 *
 * Note:
 *
 *     The linked list will have at least two elements.
 *     All of the nodes' values will be unique.
 *     The given node will not be the tail and it will always be a valid node of the linked list.
 *     Do not return anything from your function.
 */
public class DeleteNodeInLinkedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {
        //这种方法是比较简单的方式，但是事件复杂度才百分之五十
//        node.val = node.next.val;
//        node.next = node.next.next;

        //网上看到的新的一种方式，但是垃圾收集需要考虑一下,在中文leetcode没区别还是百分之五十😂
        ListNode current = node;
        ListNode next = node.next;
        current.next = next.next;
        current.val = next.val;
    }
}
