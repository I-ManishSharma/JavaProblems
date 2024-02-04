import java.util.Arrays;

public class SelectionSort {

    static void selectionSort(int [] arr) {
        System.out.println("Increasing Order");
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minPos = i;
            for (int j = i+1; j < n; j++) {
                if (arr[minPos] > arr[j]) minPos = j;
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Decreasing Order");
        for (int i = 0; i < n; i++) {
            int minPos = i;
            for (int j = i+1; j < n; j++) {
                if (arr[minPos] < arr[j]) minPos = j;
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int [] arr = {3,6,2,1,8,7,4,5,3,1};
        selectionSort(arr);
    }
}
