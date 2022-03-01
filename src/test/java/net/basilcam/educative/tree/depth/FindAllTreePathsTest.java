package net.basilcam.educative.tree.depth;

import net.basilcam.educative.tree.TreeNode;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindAllTreePathsTest {

    @Test
    public void exampleOne() {
        TreeNode node0 = new TreeNode(1);

        TreeNode node1_0 = new TreeNode(7);
        node0.left = node1_0;
        TreeNode node1_1 = new TreeNode(9);
        node0.right = node1_1;

        TreeNode node2_0 = new TreeNode(4);
        node1_0.left = node2_0;
        TreeNode node2_1 = new TreeNode(5);
        node1_0.right = node2_1;
        TreeNode node2_2 = new TreeNode(2);
        node1_1.left = node2_2;
        TreeNode node2_3 = new TreeNode(7);
        node1_1.right = node2_3;

        assertThat(FindAllTreePaths.findPaths(node0, 12)).containsExactlyInAnyOrder(
                Lists.newArrayList(1, 7, 4),
                Lists.newArrayList(1, 9, 2));
    }

    @Test
    public void exampleTwo() {
        TreeNode node0 = new TreeNode(12);

        TreeNode node1_0 = new TreeNode(7);
        node0.left = node1_0;
        TreeNode node1_1 = new TreeNode(1);
        node0.right = node1_1;

        TreeNode node2_0 = new TreeNode(4);
        node1_0.left = node2_0;
        TreeNode node2_2 = new TreeNode(10);
        node1_1.left = node2_2;
        TreeNode node2_3 = new TreeNode(5);
        node1_1.right = node2_3;

        assertThat(FindAllTreePaths.findPaths(node0, 23)).containsExactlyInAnyOrder(
                Lists.newArrayList(12, 7, 4),
                Lists.newArrayList(12, 1, 10));
    }
}