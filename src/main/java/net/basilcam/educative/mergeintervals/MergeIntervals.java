package net.basilcam.educative.mergeintervals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    // complexity analysis: O(N log N)
    //  - sort: N log N
    //  - iterate through: N

    public static List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() <= 1) {
            return intervals;
        }

        List<Interval> sortedIntervals = new ArrayList<>(intervals);
        sortedIntervals.sort(Comparator.comparingInt(a -> a.start));

        List<Interval> mergedIntervals = new ArrayList<>();
        Interval prev = sortedIntervals.get(0);
        mergedIntervals.add(prev);

        for (int i = 1; i < sortedIntervals.size(); i++) {
            Interval current = sortedIntervals.get(i);

            if (current.start <= prev.end) {
                prev.end = Math.max(prev.end, current.end);
            } else {
                mergedIntervals.add(current);
                prev = current;
            }
        }

        return mergedIntervals;
    }

}
