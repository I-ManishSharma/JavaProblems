/*
 * Problem: print spiralOrder of N*N Matrix.
 */
public class SpiralOrder2 {

    static void printArray(int [][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] spiralOrder(int n) {
        int[][] arr = new int[n][n];
        System.out.println("HELLLO");
        int topRow = 0, rightCol = n - 1, bottomRow = n - 1, leftCol = 0, current = 1;
        while (current <= n * n) {
            for (int j = leftCol; j <= rightCol && current <= n * n; j++) {
                arr[topRow][j] = current++;
            }
            topRow++;
            for (int i = topRow; i <= bottomRow && current <= n * n; i++) {
                arr[i][rightCol] = current++;
            }
            rightCol--;
            for (int j = rightCol; j >= leftCol && current <= n * n; j--) {
                arr[bottomRow][j] = current++;
            }
            bottomRow--;
            for (int i = bottomRow; i >= topRow && current <= n * n; i--) {
                arr[i][leftCol] = current++;
            }
            leftCol++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int [][] arr = spiralOrder(5);
        printArray(arr);
    }
}
