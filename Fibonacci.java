import java.util.Scanner;

//With Recursion
public class Fibonacci {

    static int fibo(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    // without Recursion
    static void printFibonacci(int n) {
        int a = 0, b = 1, c;
        System.out.print(a + " " + b + " ");

        for (int i = 3; i <= n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    // Program to calculate Fibonacci Series up to n numbers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Finonacci Series till number " + n + " is: ");

        for (int i = 0; i <= n; i++) {
            System.out.print(fibo(i) + " ");
        }
        System.out.println();
        printFibonacci(n);
        sc.close();
    }
}
