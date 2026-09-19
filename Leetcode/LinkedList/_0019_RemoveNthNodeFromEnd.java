package Leetcode.LinkedList;

public class _0019_RemoveNthNodeFromEnd {
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
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        int n = 2; head = removeNthFromEnd(head, n);
        
        ListNode temp = head;
        
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    static ListNode removeNthFromEnd(ListNode head, int n) {

        if(head == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode current = dummy.next;

        for(int i = 0; i < n; i++) {
            current = current.next;
        }

        while(current != null) {
            slow = slow.next;
            current = current.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }

}
