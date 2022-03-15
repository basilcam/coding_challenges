package net.basilcam.educative.tree.breadth;

import net.basilcam.educative.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LevelAverage {

    public static List<Double> findLevelAverages(TreeNode root) {
        List<Double> averages = new ArrayList<>();
        List<TreeNode> queue = new ArrayList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            int levelSum = 0;

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.remove(0);

                levelSum += node.value;

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            averages.add((double) levelSum / (double) levelSize);
        }

        return averages;
    }
}
