import java.util.Scanner;

public class first {
    public static void main(String[] args) {

        //Program to check whether a number is a Armstrong or not.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int temp = n, r, sum=0;

        while (temp>0) {
            r = temp%10;
            temp = temp/10;
            sum = sum + r*r*r;            
        }

        if (sum==n) {
            System.out.println("true");            
        }
        else {
            System.out.println("False");
        }
        sc.close();
    }
}

