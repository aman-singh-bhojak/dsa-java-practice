package Leetcode.LinkedList;

public class _0203_RemoveLinkedListElements {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(6);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(6);
        head.next.next.next.next = new ListNode(3);

        int val = 6; head = removeElements(head, val);
        
        ListNode temp = head;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;

        while(current.next != null) {

            if(current.next.val == val) {
            current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return dummy.next;
    }
}
