package net.basilcam.leetcode;

import java.util.Objects;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode firstNode = null;
        ListNode lastNode = null;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = 0;
            int digit2 = 0;
            if (l1 != null) {
                digit1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                digit2 = l2.val;
                l2 = l2.next;
            }

            int sum = digit1 + digit2 + carry;
            if (sum >= 10) {
                carry = 1;
                sum -= 10;
            } else {
                carry = 0;
            }

            ListNode node = new ListNode(sum);
            if (firstNode == null) {
                firstNode = node;
            }
            if (lastNode != null) {
                lastNode.next = node;
            }
            lastNode = node;
        }

        return firstNode;
    }

    public static class ListNode {
        public int val;
        public ListNode next;

        ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ListNode listNode = (ListNode) o;
            return val == listNode.val
                    && Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, next);
        }
    }
}
