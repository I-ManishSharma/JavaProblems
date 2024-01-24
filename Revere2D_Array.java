/*
 * Problem: Reverse an 2D Array.
 */
public class Revere2D_Array {

    static void printArray(int [][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    //By creating new Array.
    static void reverse(int [][] arr) {
        int [][] ans = new int[3][4];
        for (int i = 0; i < arr.length; i++) {
            int k = 0;
            for (int j = arr[i].length-1; j >= 0; j--) {
                ans [i][k] = arr[i][j];
                k++;
            }
        }
        printArray(ans);
    }
    public static void main(String[] args) {
        int [][] arr = {
            {1,2,3,10},
            {4,5,6,11},
            {7,8,9,12}
        };
        reverse(arr);

    }
}
