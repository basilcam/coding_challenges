package net.basilcam.educative.subsets;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static List<List<Integer>> findPermutations(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        permutations.add(new ArrayList<>());

        for (int num : nums) {
            int queueSize = permutations.size();
            for (int j = 0; j < queueSize; j++) {
                List<Integer> permutation = permutations.remove(0);

                for (int k = 0; k <= permutation.size(); k++) {
                    List<Integer> newPerm = new ArrayList<>(permutation);
                    newPerm.add(k, num);
                    permutations.add(newPerm);
                }
            }
        }
        return permutations;
    }

    public static List<List<Integer>> findPermutations_recursive(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();

        findPermutations_recursive(nums, 0, new ArrayList<>(), permutations);

        return permutations;
    }

    private static void findPermutations_recursive(int[] nums, int currentIndex, List<Integer> permut, List<List<Integer>> permutations) {
        if (currentIndex >= nums.length) {
            permutations.add(permut);
            return;
        }

        for (int i = 0; i <= permut.size(); i++) {
            List<Integer> p = new ArrayList<>(permut);
            p.add(i, nums[currentIndex]);
            findPermutations_recursive(nums, currentIndex + 1, p, permutations);
        }
    }
}
