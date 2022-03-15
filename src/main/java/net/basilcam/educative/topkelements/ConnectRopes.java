package net.basilcam.educative.topkelements;

import java.util.PriorityQueue;

public class ConnectRopes {

    public static int minimumCostToConnectRopes(int[] ropeLengths) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int totalCost = 0;

        for (int ropeLength : ropeLengths) {
            queue.add(ropeLength);
        }

        while (queue.size() >= 2) {
            int firstRope = queue.poll();
            int secondRope = queue.poll();

            int cost = firstRope + secondRope;
            totalCost += cost;
            queue.add(cost);
        }

        return totalCost;
    }
}
