package net.basilcam.datastructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class MinHeapTest {
    private MinHeap heap;

    @BeforeEach
    public void beforeEach() {
        this.heap = new MinHeap(20);
    }

    @Test
    public void minValueShouldBeUpdatedOnInserting_insertingDecreasingElements() {
        this.heap.insert(8);
        assertThat(this.heap.getMin()).isEqualTo(8);

        this.heap.insert(6);
        assertThat(this.heap.getMin()).isEqualTo(6);

        this.heap.insert(4);
        assertThat(this.heap.getMin()).isEqualTo(4);

        this.heap.insert(2);
        assertThat(this.heap.getMin()).isEqualTo(2);
    }

    @Test
    public void minValueShouldBeUpdatedOnInserting_insertingIncreasingElements() {
        this.heap.insert(2);
        assertThat(this.heap.getMin()).isEqualTo(2);

        this.heap.insert(4);
        assertThat(this.heap.getMin()).isEqualTo(2);

        this.heap.insert(6);
        assertThat(this.heap.getMin()).isEqualTo(2);

        this.heap.insert(8);
        assertThat(this.heap.getMin()).isEqualTo(2);
    }

    @Test
    public void minValueShouldBePopped() {
        this.heap.insert(4);
        this.heap.insert(6);
        this.heap.insert(2);
        this.heap.insert(5);

        assertThat(this.heap.getSize()).isEqualTo(4);
        assertThat(this.heap.popMin()).isEqualTo(2);
        assertThat(this.heap.getSize()).isEqualTo(3);
    }

    @Test
    public void shouldGetLevels() {
        this.heap.insert(4);
        this.heap.insert(6);
        this.heap.insert(2);
        this.heap.insert(5);

        List<List<Integer>> levels = this.heap.getLevels();
        assertThat(levels.get(0)).containsExactly(2);
        assertThat(levels.get(1)).containsExactly(5, 4);
        assertThat(levels.get(2)).containsExactly(6);
    }

    @Test
    public void shouldGetPaths() {
        this.heap.insert(4);
        this.heap.insert(6);
        this.heap.insert(2);
        this.heap.insert(5);

        List<List<Integer>> paths = this.heap.getPaths();
        assertThat(paths.get(0)).containsExactly(2, 5, 6);
        assertThat(paths.get(1)).containsExactly(2, 4);
    }
}