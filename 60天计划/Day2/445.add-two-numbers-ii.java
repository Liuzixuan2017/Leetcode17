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
    	//two stacks to remeber each digit of each number
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        //push two numbers into stacks
        ListNode temp1 = l1;
        ListNode temp2 = l2;

        while (temp1 != null) {
            s1.push(temp1.val);
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            s2.push(temp2.val);
            temp2 = temp2.next;
        }

        boolean carrier = false;
        ListNode node = null;
        ListNode sumList = null;
        while (s1.isEmpty() == false || s2.isEmpty() == false) {
            int pop1 = 0;
            int pop2 = 0;
            if (s1.isEmpty() == false) {
                pop1 = s1.pop();
            }
            if (s2.isEmpty() == false) {
                pop2 = s2.pop();
            }

            int sum = pop1+pop2;
            if (carrier == true) {
                sum += 1;
            }
            if (sum >= 10) {
                carrier = true;
            } else {
                carrier = false;
            }

            node = new ListNode(sum % 10);
            node.next = sumList;
            sumList = node;
        }
        if (carrier == true) {
            node = new ListNode(1);
            node.next = sumList;
            sumList = node;
        }
        return sumList;
    }
}