package net.basilcam.educative.tree.depth;

import net.basilcam.educative.tree.TreeNode;

public class PathWithGivenSequence {

    public static boolean findPath(TreeNode root, int[] sequence) {
        return findPath2(root, sequence, 0);
    }

    private static boolean findPath2(TreeNode root, int[] sequence, int index) {
        if (root == null) {
            return false;
        }
        if (index >= sequence.length || sequence[index] != root.value) {
            return false;
        }
        if (root.left == null && root.right == null && index == sequence.length - 1) {
            return true;
        }

        return findPath2(root.left, sequence, index + 1)
                || findPath2(root.right, sequence, index + 1);

    }
}
