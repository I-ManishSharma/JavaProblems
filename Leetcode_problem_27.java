/*
 * Problem: Remove Element
 * Remove all occurance of a number in and element.
 */
import java.util.ArrayList;

public class Leetcode_problem_27 {
    static int removeElement(int[] nums, int val) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : nums) {
            if (num != val) {
                result.add(num);
            }
        }

        for (int i = 0; i < result.size(); i++) {
            nums[i] = result.get(i);
        }

        return result.size();
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        System.out.println(removeElement(nums, val));
    }
}