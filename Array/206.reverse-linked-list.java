// Reverse a singly linked list.

// click to show more hints.

// Hint:
// A linked list can be reversed either iteratively or recursively. Could you implement both?


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

//iterative method
// public class Solution {
//     public ListNode reverseList(ListNode head) {
//     	if (head == null || head.next == null) {
//     		return head;
//     	}
//         ListNode prev = null;
//         ListNode curr = null;
//         ListNode next_p = null;
//         prev = head;
//         if (prev.next != null) {
//         	curr = prev.next;
//         	if (curr.next != null) {
//         		next_p = curr.next;
//         	}
//         }
//         head.next = null;
//         while(curr != null) {
//         	curr.next = prev;
//         	prev = curr;
//         	curr = next_p;
//         	if (next_p != null) {
//         		next_p = next_p.next;
//         	}
//         }
//         head = prev;
//         return head;
//     }
// }

// public class Solution {
//     public ListNode reverseList(ListNode head) {
        
//         ListNode prev = null;
//         while ( head != null ) {
//             ListNode n = head.next;
//             head.next = prev;
//             prev = head;
//             head = n;
//         }
        
//         return prev;
//     }
// }

//recursive method
// 1) Divide the list in two parts - first node and rest of the linked list.
// 2) Call reverse for the rest of the linked list.
// 3) Link rest to first.
// 4) Fix head pointer

public class Solution {
    public ListNode reverseList(ListNode head) {

    }
}

// void recursiveReverse(struct node** head_ref)
// {
//     struct node* first;
//     struct node* rest;
      
//     /* empty list */
//     if (*head_ref == NULL)
//        return;   
 
//     /* suppose first = {1, 2, 3}, rest = {2, 3} */
//     first = *head_ref;  
//     rest  = first->next;
 
//     /* List has only one node */
//     if (rest == NULL)
//        return;   
 
//     /* reverse the rest list and put the first element at the end */
//     recursiveReverse(&rest);
//     first->next->next  = first;  
     
//     /* tricky step -- see the diagram */
//     first->next  = NULL;          
 
//     /* fix the head pointer */
//     *head_ref = rest;              
// }
