package net.basilcam.educative.tree.breadth;

import net.basilcam.educative.tree.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class LevelOrderTraversalTest {

    @Test
    public void exampleOne() {
        TreeNode node0 = new TreeNode(12);
        TreeNode node1_0 = new TreeNode(7);
        node0.left = node1_0;
        TreeNode node1_1 = new TreeNode(1);
        node0.right = node1_1;
        TreeNode node2_0 = new TreeNode(9);
        node1_0.left = node2_0;
        TreeNode node2_1 = new TreeNode(10);
        node1_1.left = node2_1;
        TreeNode node2_2 = new TreeNode(5);
        node1_1.right = node2_2;

        List<List<Integer>> result = LevelOrderTraversal.traverse(node0);

        assertThat(result).containsExactly(List.of(12), List.of(7, 1), List.of(9, 10, 5));
    }
}