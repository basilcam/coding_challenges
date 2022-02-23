package net.basilcam.leetcode.two;

import net.basilcam.leetcode.two.ListNode;
import net.basilcam.leetcode.two.Solution;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void exampleOne() {
        ListNode l1 = constructNode(new int[]{2,4,3});
        ListNode l2 = constructNode(new int[]{5,6,4});
        ListNode expected = constructNode(new int[]{7,0,8});

        ListNode result = new Solution().addTwoNumbers(l1, l2);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void exampleTwo() {
        ListNode l1 = constructNode(new int[]{0});
        ListNode l2 = constructNode(new int[]{0});
        ListNode expected = constructNode(new int[]{0});

        ListNode result = new Solution().addTwoNumbers(l1, l2);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void exampleThree() {
        ListNode l1 = constructNode(new int[]{9,9,9,9,9,9,9});
        ListNode l2 = constructNode(new int[]{9,9,9,9});
        ListNode expected = constructNode(new int[]{8,9,9,9,0,0,0,1});

        ListNode result = new Solution().addTwoNumbers(l1, l2);

        assertThat(result).isEqualTo(expected);
    }


    @Test
    public void exampleFour() {
        ListNode l1 = constructNode(new int[]{1, 8});
        ListNode l2 = constructNode(new int[]{0});
        ListNode expected = constructNode(new int[]{1,8});

        ListNode result = new Solution().addTwoNumbers(l1, l2);

        assertThat(result).isEqualTo(expected);
    }

    public ListNode constructNode(int[] digits) {
        ListNode first = null;
        ListNode last = null;

        for (int digit : digits) {
            ListNode node = new ListNode(digit);
            if (first == null) {
                first = node;
            }
            if (last != null) {
                last.next = node;
            }
            last = node;
        }
        return first;
    }
}
