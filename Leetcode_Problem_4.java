/*
 * Problem: 4. Median of two Sorted Arrays
 */

import java.util.Arrays;

public class Leetcode_Problem_4 {

    // Method 1
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int n = arr.length;
        System.arraycopy(nums1, 0, arr, 0, nums1.length);
        System.arraycopy(nums2, 0, arr, nums1.length, nums2.length);
        Arrays.sort(arr);
        if (n % 2 != 0)
            return (double) arr[n / 2];

        return (double) (arr[(n - 1) / 2] + arr[n / 2]) / 2.0;
    }

    // Method 2
    /*
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int n = arr.length;
        System.arraycopy(nums1, 0, arr, 0, nums1.length);
        System.arraycopy(nums2, 0, arr, nums1.length, nums2.length);
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        if (n % 2 != 0)
            return (double) arr[n / 2];

        return (double) (arr[(n - 1) / 2] + arr[n / 2]) / 2.0;
    }
    */
    public static void main(String[] args) {
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2 };
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
