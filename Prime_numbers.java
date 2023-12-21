import java.util.Scanner;

public class Prime_numbers {

    //Program to print 'n' Prime numbers.

    static boolean isPrime(int num) {
        if (num==0 || num==1) {
            return false;
        }
        else {
            for (int i = 2; i <= num/2; i++) {
                if (num%i==0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        
        for (int i = 1; i <= num; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
