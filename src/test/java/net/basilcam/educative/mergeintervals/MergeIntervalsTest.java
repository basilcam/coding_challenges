package net.basilcam.educative.mergeintervals;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MergeIntervalsTest {

    @Test
    public void exampleOne() {
        List<Interval> intervals = List.of(new Interval(1, 4),
                new Interval(2, 5),
                new Interval(7, 9));

        assertThat(MergeIntervals.merge(intervals)).containsExactly(
                new Interval(1, 5),
                new Interval(7, 9));
    }

    @Test
    public void exampleTwo() {
        List<Interval> intervals = List.of(new Interval(6, 7),
                new Interval(2, 4),
                new Interval(5, 9));

        assertThat(MergeIntervals.merge(intervals)).containsExactly(
                new Interval(2, 4),
                new Interval(5, 9));
    }

    @Test
    public void exampleThree() {
        List<Interval> intervals = List.of(new Interval(1, 4),
                new Interval(2, 6),
                new Interval(3, 5));

        assertThat(MergeIntervals.merge(intervals)).containsExactly(new Interval(1, 6));
    }
}