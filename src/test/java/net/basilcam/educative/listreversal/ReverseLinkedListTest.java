package net.basilcam.educative.listreversal;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class ReverseLinkedListTest {

    @Test
    public void exampleOne() {
        ListNode node0 = new ListNode(2);
        ListNode node1 = new ListNode(4);
        node0.next = node1;
        ListNode node2 = new ListNode(6);
        node1.next = node2;
        ListNode node3 = new ListNode(8);
        node2.next = node3;
        ListNode node4 = new ListNode(10);
        node3.next = node4;

        ListNode result = ReverseLinkedList.reverse(node0);

        ListNode node = result;
        assertThat(node.value).isEqualTo(10);
        node = node.next;
        assertThat(node.value).isEqualTo(8);
        node = node.next;
        assertThat(node.value).isEqualTo(6);
        node = node.next;
        assertThat(node.value).isEqualTo(4);
        node = node.next;
        assertThat(node.value).isEqualTo(2);
    }
}