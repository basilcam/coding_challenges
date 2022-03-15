package net.basilcam.educative.tree.depth;

import net.basilcam.educative.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PathWithGivenSequenceTest {

    @Test
    public void exampleOne() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(7);
        root.right = new TreeNode(9);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(9);

        int[] sequence = new int[] {1, 9, 9};

        assertThat(PathWithGivenSequence.findPath(root, sequence)).isTrue();
    }
}