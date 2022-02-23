package net.basilcam.educative.tree.breadth;

import net.basilcam.educative.tree.TreeNode;

import java.util.*;

public class ZigZagTraversal {

    public static List<List<Integer>> traverse(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>(levelSize);

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                if (result.size() % 2 == 0) {
                    level.add(node.val);
                } else {
                    level.add(0, node.val);
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            result.add(level);
        }
        return result;
    }

    public static List<List<Integer>> traverse_fun(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>(levelSize);

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);

                if (node.right != null) {
                    queue.offer(node.right);
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
            }

            if (result.size() % 2 == 1) {
                Stack<TreeNode> stack = new Stack<>();
                while (!queue.isEmpty()) {
                    stack.push(queue.poll());
                }
                while (!stack.isEmpty()) {
                    queue.offer(stack.pop());
                }
            }

            result.add(level);
        }
        return result;
    }
}
