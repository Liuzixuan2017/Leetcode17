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
        if (head == null || head.next == null) {
        	return head;
        }

        ListNode prev = head;
        ListNode follow = head.next;
        ListNode second = null;
        ListNode newHead = null;

        while (prev != null && follow != null) {
        	if (newHead == null) {
        		newHead = follow;
        	}
        	prev.next = follow.next;
        	follow.next = prev;
        	if (second == null) {
        		second = head;
        	} else {
        		second.next = follow;
        		second = prev;
        	}       	
        	prev = prev.next;
        	if (prev != null) {
        		follow = prev.next;
        	}	
        }
        return newHead;
    }
}