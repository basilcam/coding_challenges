package net.basilcam.educative.fastslowpointers;

public class HappyNumber {
    public static boolean isHappy(int num) {
        int slow = num;
        int fast = num;
        do {
            slow = calculateSquareSum(slow);
            fast = calculateSquareSum(calculateSquareSum(fast));
        } while (slow != fast);

        return slow == 1;
    }

    private static int calculateSquareSum(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, 2);
            num /= 10;
        }
        return sum;
    }
}
