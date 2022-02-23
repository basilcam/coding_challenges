package net.basilcam.educative.listreversal;

public class ReverseLinkedList {

    public static ListNode reverse(ListNode head) {
        ListNode lastNode = null;
        ListNode currentNode = head;
        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = lastNode;
            lastNode = currentNode;
            currentNode = nextNode;
        }

        return lastNode;
    }
}
