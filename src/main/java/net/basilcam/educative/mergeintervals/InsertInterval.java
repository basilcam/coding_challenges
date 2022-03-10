package net.basilcam.educative.mergeintervals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InsertInterval {

    public static List<Interval> insert(List<Interval> intervals, Interval insert) {
        List<Interval> result = new ArrayList<>();

        int index = 0;
        while (index < intervals.size() && intervals.get(index).end < insert.start) {
            result.add(intervals.get(index));
            index++;
        }

        while (index < intervals.size() && intervals.get(index).start <= insert.end) {
            insert.start = Math.min(insert.start, intervals.get(index).start);
            insert.end = Math.max(insert.end, intervals.get(index).end);
            index++;
        }

        result.add(insert);

        while (index < intervals.size()) {
            result.add(intervals.get(index));
            index++;
        }

        return result;
    }

    public static List<Interval> insert_naive(List<Interval> intervals, Interval insert) {
        List<Interval> result = new ArrayList<>();

        boolean hasFoundStart = false;
        boolean hasFoundEnd = false;
        int startInterval = -1;

        Iterator<Interval> iterator = intervals.iterator();
        while (iterator.hasNext()) {
            Interval current = iterator.next();

            if (!hasFoundStart) {
                if (current.start >= insert.start) { // start occurred between (prev.end, current.start]
                    hasFoundStart = true;
                    startInterval = insert.start;
                } else if (current.end >= insert.start) { // start occurred between (current.start, current.end]
                    hasFoundStart = true;
                    startInterval = current.start;
                }
            }

            if (hasFoundStart) {
                if (current.start >= insert.end) { // end occurred between (prev.end, current.start]
                    hasFoundEnd = true;
                    result.add(new Interval(startInterval, insert.end));
                    result.add(current);
                    break;
                } else if (current.end >= insert.end) {  // end occurred between (current.start, current.end]
                    hasFoundEnd = true;
                    result.add(new Interval(startInterval, current.end));
                    break;
                }
            }

            if (!hasFoundStart) {
                result.add(current);
            }
        }

        while (iterator.hasNext()) {
            Interval current = iterator.next();
            result.add(current);
        }

        if (!hasFoundEnd) {
            result.add(new Interval(startInterval, insert.end));
        }

        return result;
    }
}
