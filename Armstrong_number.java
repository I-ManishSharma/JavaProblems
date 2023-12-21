import java.util.Scanner;

public class Armstrong_number {

    static boolean isArmstrong(int a) {
        int temp=a, r, sum=0;
        while (temp!=0) {
            r = temp%10;
            sum = sum + (r*r*r);
            temp /= 10;
        }
        if (sum == a) {
            return true;
        }
        return false;
    }
    //Program to find all Armstrong numbers btw two numbers.
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            if (isArmstrong(i)) {
                System.out.print(i+" ");
            }
        }

        sc.close();
    }
}
