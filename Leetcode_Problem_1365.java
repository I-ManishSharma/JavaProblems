import java.util.Arrays;

/**
 * Leetcode_Problem_1365: How Many Numbers Are Smaller Then The Current Number.
 */
public class Leetcode_Problem_1365 {

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int digit = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] != nums[j] && nums[i] > nums[j]) {
                    digit++;
                }
            }
            result[i] = digit;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        System.out.print(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
}