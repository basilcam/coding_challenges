package net.basilcam.educative.toposort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskScheduling {

    public static boolean isSchedulingPossible(int tasks, int[][] prereqs) {
        Map<Integer, Integer> prereqCounts = new HashMap<>();
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int i = 0; i < tasks; i++) {
            prereqCounts.put(i, 0);
            graph.put(i, new ArrayList<>());
        }

        for (int i = 0; i < prereqs.length; i++) {
            int parent = prereqs[i][0];
            int child = prereqs[i][1];

            int count = prereqCounts.get(child);
            count++;
            prereqCounts.put(child, count);

            graph.get(parent).add(child);
        }

        List<Integer> sources = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : prereqCounts.entrySet()) {
            if (entry.getValue() == 0) {
                sources.add(entry.getKey());
            }
        }

        List<Integer> sorted = new ArrayList<>();
        while (!sources.isEmpty()) {
            int node = sources.remove(0);
            sorted.add(node);

            List<Integer> children = graph.get(node);
            for (int child : children) {
                int count = prereqCounts.get(child);
                count--;
                prereqCounts.put(child, count);

                if (count == 0) {
                    sources.add(child);
                }
            }
        }

        System.out.println(sorted);
        return sorted.size() == tasks;
    }
}
