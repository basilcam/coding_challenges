package net.basilcam.educative.fastslowpointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MiddleOfLinkedListTest {

    @Test
    public void exampleOne() {
        ListNode node0 = new ListNode(1);
        ListNode node1 = new ListNode(2);
        node0.next = node1;
        ListNode node2 = new ListNode(3);
        node1.next = node2;
        ListNode node3 = new ListNode(4);
        node2.next = node3;
        ListNode node4 = new ListNode(5);
        node3.next = node4;

        assertThat(MiddleOfLinkedList.findMiddle(node0)).isEqualTo(node2);
    }

    @Test
    public void exampleTwo() {
        ListNode node0 = new ListNode(1);
        ListNode node1 = new ListNode(2);
        node0.next = node1;
        ListNode node2 = new ListNode(3);
        node1.next = node2;
        ListNode node3 = new ListNode(4);
        node2.next = node3;
        ListNode node4 = new ListNode(5);
        node3.next = node4;
        ListNode node5 = new ListNode(6);
        node4.next = node5;

        assertThat(MiddleOfLinkedList.findMiddle(node0)).isEqualTo(node3);
    }

    @Test
    public void exampleThree() {
        ListNode node0 = new ListNode(1);
        ListNode node1 = new ListNode(2);
        node0.next = node1;
        ListNode node2 = new ListNode(3);
        node1.next = node2;
        ListNode node3 = new ListNode(4);
        node2.next = node3;
        ListNode node4 = new ListNode(5);
        node3.next = node4;
        ListNode node5 = new ListNode(6);
        node4.next = node5;
        ListNode node6 = new ListNode(7);
        node5.next = node6;

        assertThat(MiddleOfLinkedList.findMiddle(node0)).isEqualTo(node3);
    }
}