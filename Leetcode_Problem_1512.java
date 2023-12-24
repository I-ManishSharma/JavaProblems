/*
 * 1512. Number of Good Pairs
 */

public class Leetcode_Problem_1512 {

    static int numIdenticalPairs(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    count++;
                }
            }
            ans += count;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1, 1, 3 };
        System.out.println(numIdenticalPairs(nums));
    }
}
