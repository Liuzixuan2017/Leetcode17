/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        boolean carrier = false;
        ListNode prev = null;
        ListNode firstnode = null;
        ListNode node = null;
        int sum = 0;
        while (temp1 != null || temp2 != null) {
        	if (temp1 == null) {
        		sum = temp2.val;
        	} else if (temp2 == null) {
        		sum = temp1.val;
        	} else {
        		sum = temp1.val + temp2.val;
        	}
        	if (carrier == true) {
        		sum += 1;
        	}
        	if (sum >= 10) {
        		carrier = true;
        	} else {
        		carrier = false;
        	}
        	node = new ListNode(sum % 10);
        	if (firstnode == null) {
        		firstnode = node;
        	}
        	node.next = null;
        	if (prev != null) {
        		prev.next = node;
        	}
        	prev = node;
        	if (temp1 != null) {
        		temp1 = temp1.next;
        	}
        	if (temp2 != null) {
        		temp2 = temp2.next;
        	}	
        }
        if (carrier == true) {
        	ListNode lastnode = new ListNode(1);
        	node.next = null;
        	prev.next = lastnode;
        }
        return firstnode;
    }
}