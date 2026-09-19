package Leetcode.LinkedList;

public class _0141_LinkedListCycle {
    
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

        head.next.next.next.next = head.next;

        System.out.println(hasCycle(head));
    }

    static boolean hasCycle(ListNode head) {

        if(head == null || head.next == null) {
            return false;
        }

        ListNode first = head;
        ListNode second = head;
        
        while(second != null && second.next != null) {
            first = first.next;
            second = second.next.next;
            if(first == second) {
                return true;
            }
        }

        return false;
    }

}
