package net.basilcam.educative.tree.breadth;

import net.basilcam.educative.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LevelAverageTest {

    @Test
    public void exampleOne() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        assertThat(LevelAverage.findLevelAverages(root)).containsExactly(1.0, 2.5, 5.5);
    }

    @Test
    public void exampleTwo() {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);

        assertThat(LevelAverage.findLevelAverages(root)).containsExactly(12.0, 4.0, 6.5);
    }
}