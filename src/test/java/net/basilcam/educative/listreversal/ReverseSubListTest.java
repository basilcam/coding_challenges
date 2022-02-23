package net.basilcam.educative.listreversal;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseSubListTest {

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

        ListNode result = ReverseSubList.reverse(node0, 2, 4);

        ListNode node = result;
        assertThat(node.value).isEqualTo(1);
        node = node.next;
        assertThat(node.value).isEqualTo(4);
        node = node.next;
        assertThat(node.value).isEqualTo(3);
        node = node.next;
        assertThat(node.value).isEqualTo(2);
        node = node.next;
        assertThat(node.value).isEqualTo(5);
    }
}