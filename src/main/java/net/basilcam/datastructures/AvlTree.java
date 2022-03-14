package net.basilcam.datastructures;

public class AvlTree {
    private TreeNode root;

    AvlTree() {
        this.root = null;
    }

    public void insert(int value) {
        this.root = insert(this.root, value);
    }

    private static TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }

        if (value < root.value) {
            root.left = insert(root.left, value);
        } else if (value > root.value) {
            root.right = insert(root.right, value);
        } else { // no duplicates
            return root;
        }

        root.height = 1 + Math.max(height(root.left), height(root.right));

        int balance = getBalance(root);

        // left left case
        if (balance > 1 && value < root.left.value) {
            return rightRotate(root);
        }

        // left right case
        if (balance > 1 && value > root.left.value) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // right right case
        if (balance < -1 && value > root.right.value) {
            return leftRotate(root);
        }

        // right left case
        if (balance < -1 && value < root.right.value) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    private static int getBalance(TreeNode node) {
        if (node == null) {
            return 0;
        }

        return height(node.left) - height(node.right);
    }

    private static TreeNode rightRotate(TreeNode y) {
        TreeNode x = y.left;
        TreeNode t2 = x.right;

        x.right = y;
        y.left = t2;

        y.height = Math.max(height(y.left), height(y.right));
        x.height = Math.max(height(x.left), height(x.right));

        return x;
    }

    private static TreeNode leftRotate(TreeNode x) {
        TreeNode y = x.right;
        TreeNode t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height = Math.max(height(x.left), height(x.right));
        y.height = Math.max(height(y.left), height(y.right));

        return y;
    }

    private static int height(TreeNode node) {
        if (node == null) {
            return 0;
        }

        return node.height;
    }

    private static class TreeNode {
        AvlTree.TreeNode left;
        AvlTree.TreeNode right;
        int value;
        int height;

        public TreeNode(int value) {
            this.left = null;
            this.right = null;
            this.value = value;
            this.height = 1;
        }
    }
}
