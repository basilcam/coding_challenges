package net.basilcam.datastructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchTreeTest {
    private BinarySearchTree tree;

    @BeforeEach
    public void beforeEach() {
        this.tree = new BinarySearchTree();
    }

    @Test
    public void sizeShouldIncrement_insertingValues() {
        assertThat(this.tree.getSize()).isEqualTo(0);

        this.tree.insert(5);
        assertThat(this.tree.getSize()).isEqualTo(1);

        this.tree.insert(7);
        assertThat(this.tree.getSize()).isEqualTo(2);

        this.tree.insert(3);
        assertThat(this.tree.getSize()).isEqualTo(3);

        this.tree.insert(6);
        assertThat(this.tree.getSize()).isEqualTo(4);
    }

    @Test
    public void sizeShouldDecrement_removingValues_leaf() {
        buildInitialTree();

        assertThat(this.tree.remove(6)).isTrue();
        assertThat(this.tree.getSize()).isEqualTo(4);

        assertThat(this.tree.remove(8)).isTrue();
        assertThat(this.tree.getSize()).isEqualTo(3);

        assertThat(this.tree.remove(3)).isTrue();
        assertThat(this.tree.getSize()).isEqualTo(2);

        assertThat(this.tree.remove(7)).isTrue();
        assertThat(this.tree.getSize()).isEqualTo(1);

        assertThat(this.tree.remove(5)).isTrue();
        assertThat(this.tree.getSize()).isEqualTo(0);
    }

    @Test
    public void sizeShouldDecrement_removingValues_nonLeaf() {
        buildInitialTree();

        assertThat(this.tree.remove(7)).isTrue();
        assertThat(this.tree.getSize()).isEqualTo(4);

        assertThat(this.tree.remove(8)).isTrue();
        assertThat(this.tree.getSize()).isEqualTo(3);
    }

    @Test
    public void shouldFailToAddSameValueTwice() {
        buildInitialTree();

        assertThat(this.tree.insert(9)).isTrue();
        assertThat(this.tree.getSize()).isEqualTo(6);

        assertThat(this.tree.insert(9)).isFalse();
        assertThat(this.tree.getSize()).isEqualTo(6);
    }

    @Test
    public void shouldGetLevels() {
        buildInitialTree();

        List<List<Integer>> levels = this.tree.getLevels();

        assertThat(levels.get(0)).containsExactly(5);
        assertThat(levels.get(1)).containsExactly(3, 7);
        assertThat(levels.get(2)).containsExactly(6, 8);
    }

    @Test
    public void shouldGetPaths() {
        buildInitialTree();

        List<List<Integer>> paths = this.tree.getPaths();

        assertThat(paths.get(0)).containsExactly(5, 3);
        assertThat(paths.get(1)).containsExactly(5, 7, 6);
        assertThat(paths.get(2)).containsExactly(5, 7, 8);
    }

    private void buildInitialTree() {
        this.tree.insert(5);
        this.tree.insert(7);
        this.tree.insert(3);
        this.tree.insert(6);
        this.tree.insert(8);
        assertThat(this.tree.getSize()).isEqualTo(5);
    }
}