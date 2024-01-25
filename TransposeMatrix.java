import java.util.Scanner;

public class TransposeMatrix {

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
        transposeMatrix(arr, r, c);
        //transposeMatrixInPlace(arr, r, c);
        sc.close();
    }

    //In-Place: Only Square Matrix can be transpose in-place.
    static void transposeMatrixInPlace(int [][] arr, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        printArray(arr);
    }

    //Using new array.
    static void transposeMatrix(int [][] arr, int r, int c) {
        int [][] ans = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = arr[j][i];
            }
        }
        printArray(ans);
    }
    public static void main(String[] args) {
        userInput();
    }
}
