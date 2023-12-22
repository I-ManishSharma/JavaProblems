import java.util.Arrays;

public class Leetcode_ConcatenationOfArray {

    static int[] concatinate(int[] arr) {
        int[] ans = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[i];
            ans[arr.length + i] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(concatinate(arr)));
    }
}
