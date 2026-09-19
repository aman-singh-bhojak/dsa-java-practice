package Leetcode.LinkedList;

public class _0083_RemoveDuplicatesFromSortedList {

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
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        
        head = deleteDuplicates(head); 
        
        ListNode temp = head;
        
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;

        while(temp != null && temp.next != null) {

            if(temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
            temp = temp.next;
            }
            
        }

        return head;
    }
}
