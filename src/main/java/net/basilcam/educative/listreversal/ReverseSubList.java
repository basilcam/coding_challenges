package net.basilcam.educative.listreversal;

public class ReverseSubList {

    // reverse the linked list from index p to q
    // assume p < q
    // assume index from 1

    public static ListNode reverse(ListNode head, int p, int q) {

        int nodeIndex = 1;
        ListNode lastNode = null;
        ListNode currentNode = head;

        ListNode nodeBeforeRange = null; // may be null if range is at beginning
        ListNode nodeAfterRange = null; // may be null if range is at end

        ListNode rangeStartNode = null;
        ListNode rangeEndNode = null;


        while (currentNode != null) {
            ListNode nextNode = currentNode.next;

            if (nodeIndex == p - 1) {
                nodeBeforeRange = currentNode;
            } else if (nodeIndex == p) {
                rangeStartNode = currentNode;
            } else if (nodeIndex == q) {
                rangeEndNode = currentNode;
            } else if (nodeIndex == q + 1) {
                nodeAfterRange = currentNode;
            }

            if (nodeIndex > p && nodeIndex <= q) {
                currentNode.next = lastNode;
            }

            nodeIndex++;
            lastNode = currentNode;
            currentNode = nextNode;
        }

        if (nodeBeforeRange != null) {
            nodeBeforeRange.next = rangeEndNode;
        }
        rangeStartNode.next = nodeAfterRange;

        if (nodeBeforeRange == null) {
            return rangeEndNode;
        }
        return head;
    }
}
