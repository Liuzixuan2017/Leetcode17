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
    	if (head == null) {
    		return false;
    	}
        ListNode oneStep = head;
        ListNode twoStep = head;

        //exit the loop means there is no cycle;
        while (oneStep != null && twoStep != null) {
        	//oneStep advance one step at a time
        	oneStep = oneStep.next;
        	twoStep = twoStep.next;
        	if (twoStep != null) {
        		twoStep = twoStep.next;
        		if (oneStep == twoStep) {
        			return true;
        		}
        		//it has to be here otherwise test case [1] no cyle cannot pase
        	}      	
        }
        return false;
    }
}