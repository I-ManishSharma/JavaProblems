import java.util.Arrays;

public class Leetcode_ArrayFromPermutation {

    static int[] buildArray(int[] nums) {
        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newArray[i] = nums[nums[i]];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int [] arr = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(arr)));
    }
}