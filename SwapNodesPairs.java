/*
Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        
        if(head==null)
        {
            return null;
        }
        
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode curr=dummy;
        
        while(curr.next!=null && curr.next.next!=null)
        {
            ListNode first=curr.next;
            ListNode second=first.next;
            
            first.next=second.next;
            second.next=first;
            curr.next=second;
            curr=first;
        }
        return dummy.next;
        
    }
}