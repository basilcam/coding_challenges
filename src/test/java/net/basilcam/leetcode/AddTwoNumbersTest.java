package net.basilcam.leetcode;

import net.basilcam.leetcode.AddTwoNumbers;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AddTwoNumbersTest {

    @Test
    public void exampleOne() {
        AddTwoNumbers.ListNode l1 = constructNode(new int[]{2,4,3});
        AddTwoNumbers.ListNode l2 = constructNode(new int[]{5,6,4});
        AddTwoNumbers.ListNode expected = constructNode(new int[]{7,0,8});

        AddTwoNumbers.ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void exampleTwo() {
        AddTwoNumbers.ListNode l1 = constructNode(new int[]{0});
        AddTwoNumbers.ListNode l2 = constructNode(new int[]{0});
        AddTwoNumbers.ListNode expected = constructNode(new int[]{0});

        AddTwoNumbers.ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void exampleThree() {
        AddTwoNumbers.ListNode l1 = constructNode(new int[]{9,9,9,9,9,9,9});
        AddTwoNumbers.ListNode l2 = constructNode(new int[]{9,9,9,9});
        AddTwoNumbers.ListNode expected = constructNode(new int[]{8,9,9,9,0,0,0,1});

        AddTwoNumbers.ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);

        assertThat(result).isEqualTo(expected);
    }


    @Test
    public void exampleFour() {
        AddTwoNumbers.ListNode l1 = constructNode(new int[]{1, 8});
        AddTwoNumbers.ListNode l2 = constructNode(new int[]{0});
        AddTwoNumbers.ListNode expected = constructNode(new int[]{1,8});

        AddTwoNumbers.ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);

        assertThat(result).isEqualTo(expected);
    }

    public AddTwoNumbers.ListNode constructNode(int[] digits) {
        AddTwoNumbers.ListNode first = null;
        AddTwoNumbers.ListNode last = null;

        for (int digit : digits) {
            AddTwoNumbers.ListNode node = new AddTwoNumbers.ListNode(digit);
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
