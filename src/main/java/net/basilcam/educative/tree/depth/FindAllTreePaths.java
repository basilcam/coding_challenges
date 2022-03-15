package net.basilcam.educative.tree.depth;

import net.basilcam.educative.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class FindAllTreePaths {

    public static List<List<Integer>> findPaths(TreeNode root, int sum) {
        List<List<Integer>> paths = new ArrayList<>();
        int remainingSum = sum - root.value;

        if (remainingSum == 0) {
            List<Integer> path = new ArrayList<>();
            path.add(root.value);
            paths.add(path);
            return paths;
        }

        if (root.left != null) {
            List<List<Integer>> leftPaths = findPaths(root.left, remainingSum);
            for (List<Integer> leftPath : leftPaths) {
                leftPath.add(0, root.value);
                paths.add(leftPath);
            }
        }

        if (root.right != null) {
            List<List<Integer>> rightPaths = findPaths(root.right, remainingSum);
            for (List<Integer> rightPath : rightPaths) {
                rightPath.add(0, root.value);
                paths.add(rightPath);
            }
        }

        return paths;
    }
}
