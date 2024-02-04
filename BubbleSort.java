import java.util.Arrays;

public class BubbleSort {

    static void bubbleSort(int [] arr) {
        int n = arr.length;
        System.out.println("Increasing Order");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Decreasing Order");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int [] arr = {3,6,2,1,8,7,4,5,3,1};
        bubbleSort(arr);
    }
}
