package net.basilcam.educative.tree.depth;

import net.basilcam.educative.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SumOfPathNumbersTest {

    @Test
    public void exampleOne() {
        TreeNode node0 = new TreeNode(1);

        TreeNode node1_0 = new TreeNode(7);
        node0.left = node1_0;
        TreeNode node1_1 = new TreeNode(9);
        node0.right = node1_1;

        TreeNode node2_2 = new TreeNode(2);
        node1_1.left = node2_2;
        TreeNode node2_3 = new TreeNode(9);
        node1_1.right = node2_3;

        assertThat(SumOfPathNumbers.findSumOfPathNumbers(node0)).isEqualTo(408);
    }

}