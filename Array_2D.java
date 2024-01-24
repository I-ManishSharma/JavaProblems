import java.util.Scanner;

public class Array_2D {
    
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
        System.out.println("Enter the number of rows and colomn: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter " + r*c + " elements: ");
        int [][] arr1 = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        sc.close();
        printArray(arr1);
    }
    public static void main(String[] args) {
        int [] [] arr = {
            {2,4,5},
            {7,9,3},
            {9,3,4}
        };
        printArray(arr);
        userInput();
    }
}
