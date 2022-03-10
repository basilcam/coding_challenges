package net.basilcam.educative.mergeintervals;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class InsertIntervalTest {

    @Test
    public void exampleOne() {
        List<Interval> intervals = List.of(new Interval(1, 3),
                new Interval(5, 7),
                new Interval(8, 12));

        assertThat(InsertInterval.insert(intervals, new Interval(4, 6))).containsExactly(
                new Interval(1, 3),
                new Interval(4, 7),
                new Interval(8, 12));
    }

    @Test
    public void exampleTwo() {
        List<Interval> intervals = List.of(new Interval(1, 3),
                new Interval(5, 7),
                new Interval(8, 12));

        assertThat(InsertInterval.insert(intervals, new Interval(4, 10))).containsExactly(
                new Interval(1, 3),
                new Interval(4, 12));
    }

    @Test
    public void exampleThree() {
        List<Interval> intervals = List.of(new Interval(2, 3),
                new Interval(5, 7));

        assertThat(InsertInterval.insert(intervals, new Interval(1, 4))).containsExactly(
                new Interval(1, 4),
                new Interval(5, 7));
    }
}