package net.basilcam.educative.subsets;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    // find all distinct subsets

    public static List<List<Integer>> findSubsets(int[] set) {
        List<List<Integer>> queue = new ArrayList<>();
        queue.add(new ArrayList<>());

        for (int val : set) {
            int queueSize = queue.size();
            for (int j = 0; j < queueSize; j++) {
                List<Integer> subset = queue.get(j);

                List<Integer> with = new ArrayList<>(subset);
                with.add(val);
                queue.add(with);
            }
        }

        return queue;
    }
}
