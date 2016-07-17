/*
Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.

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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null)
        {
            return head;
        }
        
        ListNode current=head;
        
        ListNode next;
        
        while(current.next!=null)
        {
            if(current.val==current.next.val)
            {
                next=current.next.next;
                current.next=null;
                current.next=next;
            }
            else
            {
                current=current.next;
            }
        }
        return head;
        
    }
}