/*
 * Problem: Print nth prime number or all prime number b/w a given range.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Prime_numbers {

    // To check a number is Prime numbers or not.

    static boolean isPrime(int num) {

        if (num == 0 || num == 1) {
            return false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();
        list.add(-1);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the lower range: ");
        int a = sc.nextInt();
        System.out.print("Enter the higher range: ");
        int b = sc.nextInt();
        System.out.print("Enter the nth number: ");
        int nth = sc.nextInt();

        for (int i = a; i <= b; i++) {
            if (isPrime(i)) list.add(i);
        }

        System.out.println(nth + " Prime number b/w the given range is " + list.get(nth));

        list.remove(0);

        System.out.println("Prime numbers b/w the given range are " + list);

        sc.close();
    }
}
