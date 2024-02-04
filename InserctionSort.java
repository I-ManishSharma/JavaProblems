import java.util.Arrays;

public class InserctionSort {

    static void inserctionSort(int [] arr) {
        System.out.println("Increasing Order");
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prevPos = i-1;
            while (prevPos >= 0 && arr[prevPos] > curr) {
                arr[prevPos + 1] = arr[prevPos];
                prevPos--;
            }
            arr[prevPos + 1] = curr;
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Decreasing Order");
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prevPos = i-1;
            while (prevPos >= 0 && arr[prevPos] < curr) {
                arr[prevPos + 1] = arr[prevPos];
                prevPos--;
            }
            arr[prevPos + 1] = curr;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int [] arr = {3,6,2,1,8,7,4,5,3,1};
        inserctionSort(arr);
    }
}
