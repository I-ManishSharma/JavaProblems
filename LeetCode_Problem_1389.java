
/*
 * 1389. Create Target Array in the Given Order
 */
import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode_Problem_1389 {

    static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr.add(index[i], nums[i]);
        }
        for (int i = 0; i < arr.size(); i++) {
            target[i] = arr.get(i);
        }
        return target;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
}
