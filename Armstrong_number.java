import java.util.Scanner;

public class Armstrong_number {

    //To find the square of number
    static int square (int n, int count) {
        int ans = 1;
        for (int i = 1; i <= count; i++) {
            ans *= n;
        }
        return ans;
    }

    //To count the number of digits
    static int countNum (int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    //To check the number is Armstrong or not and if armstrong then print it.
    static void isArmstrong (int num) {
        int i = num, sum = 0;
        int count = countNum(num);
        while (i > 0) {
            int temp = i % 10;
            sum += square(temp, count);
            i /= 10;
        }
        if (num == sum) System.out.print(sum + " ");
    }
    //Program to find all Armstrong numbers btw two numbers.
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            isArmstrong(i);
        }

        sc.close();
    }
}
