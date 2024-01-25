public class PascalTrinangle {

    static void printArray(int [][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void pascalTrinangle(int n) {
        int [][] arr = new int[n][];
        for (int i = 0; i < n; i++) {
            arr[i] = new int[i+1];
            arr[i][0] = arr[i][i] = 1;
            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
            }
        }
        printArray(arr);
    }
    public static void main(String[] args) {
        int n = 5;
        pascalTrinangle(n);
    }
}
