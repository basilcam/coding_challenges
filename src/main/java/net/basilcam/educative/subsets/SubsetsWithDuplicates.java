package net.basilcam.educative.subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsWithDuplicates {
    public static List<List<Integer>> findSubsets(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> queue = new ArrayList<>();
        queue.add(new ArrayList<>());

        int startIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean isDuplicate = i > 0 && nums[i] == nums[i-1];

            startIndex = isDuplicate ? endIndex + 1 : 0;
            endIndex = queue.size() - 1;

            for (int j = startIndex; j <= endIndex; j++) {
                List<Integer> subset = queue.get(j);
                List<Integer> with = new ArrayList<>(subset);
                with.add(nums[i]);
                queue.add(with);
            }
        }

        return queue;
    }
}
