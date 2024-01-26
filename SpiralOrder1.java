/*
 * Problem: print Spiral Order.
 */
public class SpiralOrder1 {
    static void spiralOrder(int [][] arr, int r, int c) {
        System.out.println("HELLO");
        int topRow = 0, rightCol = c-1, bottomRow = r-1, leftCol = 0, totalElem = 0;
        while (totalElem < r * c) {
            for (int j = leftCol; j <= rightCol && totalElem < r * c; j++) {
                System.out.print(arr[topRow][j]+" ");
                totalElem++;
            }
            topRow++;
            for (int i = topRow; i <= bottomRow && totalElem < r * c; i++) {
                System.out.print(arr[i][rightCol]+" ");
                totalElem++;
            }
            rightCol--;
            for (int j = rightCol; j >= leftCol && totalElem < r * c; j--) {
                System.out.print(arr[bottomRow][j]+" ");
                totalElem++;
            }
            bottomRow--;
            for (int i = bottomRow; i >= topRow && totalElem < r * c; i--) {
                System.out.print(arr[i][leftCol]+" ");
                totalElem++;
            }
            leftCol++;
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
        };
        spiralOrder(arr,5,5);
    }
}
