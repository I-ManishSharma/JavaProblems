/*
 * Problem: Rotate Matrix by 90 degree.
 */
import java.util.Scanner;

public class RotateMatrix {

    static void printArray(int [][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and colomn Matrix: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter " + r*c + " elements: ");
        int [][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        rotateMatrix(arr, r, c);
        sc.close();
    }

    static int[][] transposeMatrix(int [][] arr, int r, int c) {
        int [][] ans = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
    }

    static void reverse(int [] arr) {
        int left = 0;
        int right = arr.length-1;
        while (left<right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    static void rotateMatrix(int [][] arr, int r, int c) {
        int [][] rotate = transposeMatrix(arr, r, c);
        for(int i = 0; i < rotate.length; i++) {
            reverse(rotate[i]);
        }
        System.out.println("Rotated Matrix:");
        printArray(rotate);
    }
    public static void main(String[] args) {
        userInput();
    }
}
