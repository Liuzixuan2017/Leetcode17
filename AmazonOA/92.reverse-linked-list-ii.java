/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
    	int i = 1;
    	ListNode current = head;
    	while(current != null) {
    		i++;
    		current= current.next;
    		if (i == m) {
    			ListNode nodem = current;
    		}
    		if (i == n) {
    			ListNode noden = current;
    			noden.next.next = null;
    		}
    	}
    	ListNode ret = reverseAll(nodem.next);
    	//loop through the reverse linkedlist to get the last element
    	nodem.next = ret;
        
    }

    public ListNode reverseAll(ListNode head) {
    	if (head == null || head.next == null) {
    		return head;
    	}

    	ListNode second = head.next;
    	ListNode ret = reverseAll(second);
    	second.next = head;
    	head.next = null;
    	return ret;
    }
}