/*
 * Problem: 7. Reverse Integer
 */
public class Leetcode_Problem_7 {

    static int reverse(int x) {
        long sum = 0;
        while (x != 0) {
            int r = x % 10;
            sum = (sum * 10) + r;
            x = x / 10;
        }
        if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) {
            return 0;
        }
        if (x < 0) {
            return (int) (-1 * sum);
        }
        return (int) sum;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}
