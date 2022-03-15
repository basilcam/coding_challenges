package net.basilcam.educative.tree.depth;

import net.basilcam.educative.tree.TreeNode;

public class SumOfPathNumbers {
    public static int findSumOfPathNumbers(TreeNode root) {
        return findSumOfPathNumbers(root, 0);
    }

    private static int findSumOfPathNumbers(TreeNode root, int sum) {
        sum = 10 * sum + root.value;

        if (root.left == null && root.right == null) {
            return sum;
        }

        int leftSum = 0;
        if (root.left != null) {
            leftSum = findSumOfPathNumbers(root.left, sum);
        }
        int rightSum = 0;
        if (root.right != null) {
            rightSum = findSumOfPathNumbers(root.right, sum);
        }

        return leftSum + rightSum;
    }
}
