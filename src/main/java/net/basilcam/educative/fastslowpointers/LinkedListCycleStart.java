package net.basilcam.educative.fastslowpointers;

public class LinkedListCycleStart {

    public static ListNode findCycleStart(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next.next;
        int cycleLength = -1;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                cycleLength = findCycleLength(slow, fast);
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = head;
        fast = head;
        for (int i = 0; i < cycleLength; i++) {
            fast = fast.next;
        }

        while (fast != slow) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    private static int findCycleLength(ListNode slow, ListNode fast) {
        int cycleLength = 1;
        slow = slow.next;
        while (slow != fast) {
            cycleLength++;
            slow = slow.next;
        }
        return cycleLength;
    }
}
