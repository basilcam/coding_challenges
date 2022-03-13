package net.basilcam.educative.toposort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopologicalSort {

    // graph must be directed acyclic graph (dag)
    // source node: any node with no incoming edges and only outgoing edges
    // sink node: any node with no outgoing edges and only incoming edges
    // a topo sort starts at source and ends at sink

    // complexity analysis:
    // - iterate through each node O(N)
    // - iterate through each edge O(E)
    // - total: O(N + E)

    public static List<Integer> sort(int numVertices, int[][] edges) {
        List<Integer> sortedNodes = new ArrayList<>();
        if (numVertices <= 0) {
            return sortedNodes;
        }

        Map<Integer, Integer> incomingEdgeCounts = new HashMap<>();
        Map<Integer, List<Integer>> graph = new HashMap<>();

        // build graph
        for (int i = 0; i < edges.length; i++) {
            int parent = edges[i][0];
            int child = edges[i][1];

            graph.computeIfAbsent(parent, a -> new ArrayList<>());
            graph.get(parent).add(child);

            incomingEdgeCounts.put(child, incomingEdgeCounts.getOrDefault(child, 0));
        }

        // find sources
        List<Integer> sources = new ArrayList<>();
        for (Map.Entry<Integer, Integer> nodeEntry : incomingEdgeCounts.entrySet()) {
            if (nodeEntry.getValue() == 0) {
                sources.add(nodeEntry.getKey());
            }
        }

        while (!sources.isEmpty()) {
            int node = sources.remove(0);
            sortedNodes.add(node);

            List<Integer> children = graph.get(node);
            for (int child : children) {
                int count = incomingEdgeCounts.get(child);
                count--;
                incomingEdgeCounts.put(child, count);
                if (count == 0) {
                    sources.add(child);
                }
            }
        }

        if (sortedNodes.size() != numVertices) {
            return new ArrayList<>();
        }

        return sortedNodes;
    }
}
