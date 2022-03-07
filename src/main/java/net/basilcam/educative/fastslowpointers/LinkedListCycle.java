package net.basilcam.educative.fastslowpointers;

public class LinkedListCycle {

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next.next;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                // if you want cycle length,
                // you can count the number of iterations until slow catches up to fast
                return true;
            }

            fast = fast.next.next;
            slow = slow.next;
        }

        return false;
    }
}
