package leetCode;

/**
 * #21
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * Example:
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 * 
 * 算法思想：新建一个链表，循环存储节点，考虑当某个链为空时，直接将另一个接在后面就行,
 * 另外元素开头是head.next而不是head
 * 时间复杂度O(n);
 * 空间复杂度O(n)
 * @author LittleMotor
 * @date 18.12.23
 */
public class MergeTwoSortedLists {

  public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
  
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode node = null;
    ListNode head = null;
    //判断空指针情况
    if(l1 == null)return l2;
    if(l2 == null)return l1;
    if(l1.val <= l2.val) {
      head = new ListNode(l1.val);
      node = head;
    }
    else {
      head = new ListNode(l2.val);
      node = head;
    }
    
    while(l1 != null && l2 != null) { 
      if(l1.val <= l2.val) {
        node.next = new ListNode(l1.val);
        node = node.next;
        l1 = l1.next;
        continue;
      }
      else {
        node.next = new ListNode(l2.val);
        node = node.next;
        l2 = l2.next;
      }
    }
    
    if(l1 == null) {
      node.next = l2;
    }
    if(l2 == null) {
      node.next = l1;
    }
    
    //注意返回的head.next才是头节点
    return head.next;
  }

}
