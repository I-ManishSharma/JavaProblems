/**
 * 1295. Find numbers with Even Number of digits.
 */
public class Leetcode_Problem_1295 {
    static int findNumbers(int[] nums) {
        int digit = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            while (nums[i] > 0) {
                count++;
                nums[i] /= 10;
            }
            if (count % 2 == 0) {
                digit++;
            }
        }
        return digit;
    }

    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(nums));
    }
}