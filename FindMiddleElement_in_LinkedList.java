package org.JavaArrayPrograms;

class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}


public class FindMiddleElement_in_LinkedList {
    public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    ListNode middle = findElement(head);
    if(middle != null) {
        System.out.println("Middle Element is :" + middle.data);
    }
    else
        System.out.println("Middle Element is null");
    }

    private static ListNode findElement(ListNode head) {
        if(head == null)
        {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
