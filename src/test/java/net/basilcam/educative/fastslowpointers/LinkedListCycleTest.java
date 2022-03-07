package net.basilcam.educative.fastslowpointers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LinkedListCycleTest {

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
        ListNode node5 = new ListNode(6);
        node4.next = node5;
        node5.next = node2;

        assertThat(LinkedListCycle.hasCycle(node0)).isTrue();
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

        assertThat(LinkedListCycle.hasCycle(node0)).isFalse();
    }
}