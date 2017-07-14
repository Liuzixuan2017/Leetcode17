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
    public ListNode detectCycle(ListNode head) {
        ListNode found = hasCycle(head);
        if (found == null) {
        	return null;
        }
        ListNode detect = head;
        while (detect != found) {
        	detect = detect.next;
        	found = found.next;
        }
        return detect;
    }

    public ListNode hasCycle(ListNode head) {
    	ListNode oneStep = head;
    	ListNode twoStep = head;

    	while (oneStep != null && twoStep != null) {
    		oneStep = oneStep.next;
    		twoStep = twoStep.next;

    		if (twoStep != null) {
    			twoStep = twoStep.next;
    			if (oneStep == twoStep) {
    				return oneStep;
    			}
    		}
    	}
    	return null;
    }
}