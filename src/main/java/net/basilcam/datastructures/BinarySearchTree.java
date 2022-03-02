package net.basilcam.datastructures;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    public boolean insert(int value) {
        int size = getSize();
        this.root = BinarySearchTree.insert(this.root, value);
        return getSize(this.root) != size;
    }

    public boolean remove(int value) {
        int size = getSize(this.root);
        this.root = remove(this.root, value);
        return getSize(this.root) != size;
    }

    public int getSize() {
        return getSize(this.root);
    }

    public List<List<Integer>> getLevels() {
        List<List<Integer>> levels = new ArrayList<>();

        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {
            int levelSize = nodes.size();

            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = nodes.remove(0);
                if (node.left != null) {
                    nodes.add(node.left);
                }
                if (node.right != null) {
                    nodes.add(node.right);
                }
                level.add(node.value);
            }
            levels.add(level);
        }
        return levels;
    }

    public List<List<Integer>> getPaths() {
        return getPaths(this.root);
    }

    private static TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }

        if (value < root.value) {
            root.left = insert(root.left, value);
        } else if (value > root.value) {
            root.right = insert(root.right, value);
        }

        int leftSize = root.left == null ? 0 : root.left.size;
        int rightSize = root.right == null ? 0 : root.right.size;
        root.size = leftSize + rightSize + 1;

        return root;
    }

    private static TreeNode remove(TreeNode root, int value) {
        if (root == null) {
            return null;
        }

        if (value < root.value) {
            root.left = remove(root.left, value);
        } else if (value > root.value) {
            root.right = remove(root.right, value);
        } else { // this is node to remove
            // node has one or zero children
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            // node has two children
            int smallestFromRight = smallestValue(root.right); // find next largest value after removed node
            root.value = smallestFromRight;
            root.right = remove(root.right, smallestFromRight); // remove original next largest value
        }

        int leftSize = root.left == null ? 0 : root.left.size;
        int rightSize = root.right == null ? 0 : root.right.size;
        root.size = leftSize + rightSize + 1;

        return root;
    }

    private static List<List<Integer>> getPaths(TreeNode root) {
        List<List<Integer>> paths = new ArrayList<>();

        if (root.left == null && root.right == null) {
            List<Integer> path = new ArrayList<>();
            path.add(root.value);
            paths.add(path);
            return paths;
        }

        if (root.left != null) {
            List<List<Integer>> leftPaths = getPaths(root.left);
            paths.addAll(leftPaths);
        }
        if (root.right != null) {
            List<List<Integer>> rightPaths = getPaths(root.right);
            paths.addAll(rightPaths);
        }

        for (List<Integer> path : paths) {
            path.add(0, root.value);
        }

        return paths;
    }

    private static int smallestValue(TreeNode root) {
        int smallest = root.value;
        while (root.left != null) {
            smallest = root.left.value;
            root = root.left;
        }
        return smallest;
    }

    private static int getSize(TreeNode root) {
        return root == null ? 0 : root.size;
    }

    private static class TreeNode {
        TreeNode left;
        TreeNode right;
        int value;
        int size;

        public TreeNode(int value) {
            this.left = null;
            this.right = null;
            this.value = value;
            this.size = 1;
        }
    }
}
