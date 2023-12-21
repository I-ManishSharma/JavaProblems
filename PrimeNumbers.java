import java.util.Scanner;

public class PrimeNumbers {

    //Program to check a number is prime numbers or not.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        boolean isPrime = true;
        if (num==0 || num==1) {
            isPrime = false;
        }
        else {
            int i=2;
            while (i<=num/2) {
                if (num%i==0) {
                    isPrime = false;
                }
                i++;
            }
        }
        System.out.println(isPrime);
        sc.close();
    }
}