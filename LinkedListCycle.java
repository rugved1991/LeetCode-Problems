/*
Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?
*/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if(head==null || head.next==null)
        {
            return false;
        }
        
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null)
        {
            if(fast.next!=null)
            {
                fast=fast.next.next;
                slow=slow.next;
            }
            else
            {
                return false;
            }
            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    }
}