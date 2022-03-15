package net.basilcam.educative.tree.depth;

import net.basilcam.educative.tree.TreeNode;

public class TreePathSum {

    public static boolean hasPath(TreeNode root, int sum) {
        int remainingSum = sum - root.value;
        if (remainingSum == 0) {
            return true;
        }

        if (root.left != null) {
            if (hasPath(root.left, remainingSum)) {
                return true;
            }
        }
        if (root.right != null) {
            if (hasPath(root.right, remainingSum)) {
                return true;
            }
        }

        return false;
    }
}
