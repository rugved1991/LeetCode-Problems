/*
Reverse a singly linked list.
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
    public ListNode reverseList(ListNode head) {
        
        if (head==null)
        {
            return head;
        }
        if(head.next==null)
        {
            return head;
        }
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=curr;
        
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
        
    }
}