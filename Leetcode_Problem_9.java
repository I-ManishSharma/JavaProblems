/*
 * Problem: 9. Palindrome Number
 */
public class Leetcode_Problem_9 {

    static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x;
        int sum = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum = (sum * 10) + r;
            temp /= 10;
        }
        if (x == sum) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
}
