package net.basilcam.educative.tree.depth;

import net.basilcam.educative.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TreePathSumTest {

    @Test
    public void exampleOne() {
        TreeNode node0 = new TreeNode(1);

        TreeNode node1_0 = new TreeNode(2);
        node0.left = node1_0;
        TreeNode node1_1 = new TreeNode(3);
        node0.right = node1_1;

        TreeNode node2_0 = new TreeNode(4);
        node1_0.left = node2_0;
        TreeNode node2_1 = new TreeNode(5);
        node1_0.right = node2_1;
        TreeNode node2_2 = new TreeNode(6);
        node1_1.left = node2_2;
        TreeNode node2_3 = new TreeNode(7);
        node1_1.right = node2_3;

        assertThat(TreePathSum.hasPath(node0, 10)).isTrue();
    }

    @Test
    public void exampleTwo() {
        TreeNode node0 = new TreeNode(12);

        TreeNode node1_0 = new TreeNode(7);
        node0.left = node1_0;
        TreeNode node1_1 = new TreeNode(1);
        node0.right = node1_1;

        TreeNode node2_0 = new TreeNode(9);
        node1_0.left = node2_0;
        TreeNode node2_2 = new TreeNode(10);
        node1_1.left = node2_2;
        TreeNode node2_3 = new TreeNode(5);
        node1_1.right = node2_3;

        assertThat(TreePathSum.hasPath(node0, 23)).isTrue();
        assertThat(TreePathSum.hasPath(node0, 16)).isFalse();
    }

}