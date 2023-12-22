import java.util.Arrays;

public class Leetcode_RunningSumOfArray {

    static int [] runningSum(int[]arr) {
        int []ans = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            ans[i] = sum;
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
}
