import java.util.Arrays;

public class CountingSort {

    static void countingSort(int [] arr) {
        System.out.println("Increasing Order");
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int [] freq = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;   
        }
        int j = 0;
        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                arr[j++] = i;
                freq[i]--;
            }
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Decreasing Order");
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int [] freq1 = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            freq1[arr[i]]++;   
        }
        j = 0;
        for (int i = freq.length-1; i >= 0; i--) {
            while (freq1[i] > 0) {
                arr[j++] = i;
                freq1[i]--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int [] arr = {3,6,2,1,8,7,4,5,3,1};
        countingSort(arr);
    }
}
