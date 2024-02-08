public class Recursion {

    //Problem: Print n numbers in decreasing order.
    static int printDec(int n) {
        if (n == 1) return n;
        System.out.print(n + " ");
        return printDec(n-1);
    }

    //Problem: Print n numbers in increasing irder.
    static int printInc(int n) {
        if (n == 10) return n;
        System.out.print(n + " ");
        return printInc(n+1);
    }

    //Problem: Print factorial of n.
    static int fact(int n) {
        if (n < 0) return -1;
        if (n == 0) return 1;
        return n * fact(n-1);
    }

    //Problem: Print sum of first n Natural numbers.
    static int printSumNatural(int n) {
        if (n == 1) return n; 
        return n+printSumNatural(n-1);
    }
    
    //Problem: Print Nth fibonacci number.
    static int febo(int n) {
        if (n == 0 || n == 1) return n;
        return febo(n-1) + febo(n-2);
    }

    //Problem: Check an array is sorted or not.
    static boolean isSorted(int [] arr, int i) {
        if (i == arr.length-1) return true;
        if (arr[i] > arr[i+1]) return false;
        return isSorted(arr, i+1);
    }

    //Problem: Return First Occurance in arr.
    static int firstOcc(int [] arr, int i, int key) {
        if (i == arr.length) return -1;
        if (arr[i] == key) return i;
        return firstOcc(arr, i+1, key);
    }
    //Problem: Return last Occurance in arr.
    static int lastOcc(int [] arr, int i, int key) {
        if (i == arr.length) return -1;
        int isFound = lastOcc(arr, i+1, key);
        if (isFound == -1 && arr[i] == key) return i;
        return isFound;
    }
    public static void main(String[] args) {
        System.out.println(printDec(10));
        System.out.println(printInc(1));
        System.out.println(fact(5));
        System.out.println(printSumNatural(5));
        System.out.println(febo(25)); //Print nth fibonacci number
        for (int i = 0; i <= 6; i++) {
            System.out.print(febo(i)+" "); //Print fibonacci series till nth number n = 6 in loop.
        }
        System.out.println();
        int [] arr = {1,2,3,4,5,6,7,8,5};
        System.out.println(isSorted(arr, 0));
        System.out.println(firstOcc(arr, 0, 5));
        System.out.println(lastOcc(arr, 0, 5));
    }
}
