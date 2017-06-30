/**
 * Created by liuzixuan on 6/30/17.
 */
public class reverseLL {
    public ListNode reverseAll(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode second  = head.next;
        ListNode ret = reverseAll(second);
        second.next = head;
        head.next = null;
        return ret;
    }

    public ListNode reverseSecondHalf(ListNode head) {
        int len = getLength(head);
        if (len <= 2) {
            return head;
        }
        ListNode current = head;
        int i = 0;
        while (i < len / 2 -1) {
            current = current.next;
            i++;
        }
        ListNode ret = reverseAll(current.next);
        current.next = ret;
        return head;
    }

    public int getLength(ListNode head) {
        int count  = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public void printLL(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(" " + temp.val);
            temp = temp.next;
        }
    }

    public static void main(String argvs[]) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
//        n1.next = n2;
//        n2.next = n3;
//        n3.next = n4;
//        n4.next = n5;
        reverseLL r = new reverseLL();
        ListNode ret = r.reverseSecondHalf(null);
        r.printLL(ret);
    }
}
