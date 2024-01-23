import java.util.Arrays;

public class prefixSum_Problem {

    // Problem 1: Find Prefix Sum of an array without creating new array.
    static int[] findPrefixSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            arr[i] = sum;
        }
        return arr;
    }

    // Problem 2: Find Sum of Array between two given index.
    static int sum(int[] arr, int n, int m) {
        findPrefixSum(arr);
        return arr[m] - arr[n - 1];
    }

    // Problem 3: Check if an Array can be divided into two parts such that the prefix
    // sum of array1 is equal to the suffix sum of array2.
    static int totalSum(int [] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
    static boolean checkArray(int [] arr) {
        int prefix = arr[0], totalSum = totalSum(arr);
        for (int i = 1; i < arr.length; i++) {
            if (totalSum % prefix == 0)
                return true;
            prefix += arr[i];
        }
        return false;
    }

    //Problem 4: Return a suffix Sum Array without creating new array.
    static int [] suffixSum(int [] arr) {
        int sum = arr[arr.length-1];
        for (int i = arr.length-2; i >= 0; i--) {
            sum += arr[i];
            arr[i] = sum;
        }
        return arr;
    }
    public static void main(String[] args) {
        //Problem 1
        int[] arr1 = { 5, 3, 2, 6, 3, 1 };
        System.out.println("Prefix Sum: " + Arrays.toString(findPrefixSum(arr1)));

        //Problem 2
        int[] arr2 = { 5, 3, 2, 6, 3, 1 };
        System.out.println("Sum: " + sum(arr2, 2, 4));

        //Problem 3
        int[] arr3 = { 5, 3, 2, 6, 3, 1 };
        System.out.println("Subarray can be possible or not: " + checkArray(arr3));

        //Problem 4
        int[] arr4 = { 5, 3, 2, 6, 3, 1 };
        System.out.println("Suffix Sum: " + Arrays.toString(suffixSum(arr4))); // updated arr is passed.
    }
}
