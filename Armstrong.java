import java.util.Scanner;

public class Armstrong {
    static int square (int n, int count) {
        int ans = 1;
        for (int i = 1; i <= count; i++) {
            ans *= n;
        }
        return ans;
    }
    static int countNum (int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
    public static void main(String[] args) {

        //Program to check whether a number is a Armstrong or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int i = num, sum = 0;
        int count = countNum(num);
        while (i > 0) {
            int temp = i % 10;
            sum += square(temp, count);
            i /= 10;
        }
        if (num == sum) System.out.println("Armstrong number"); else System.out.println("Not a Armstrong number");
        sc.close();
    }
}

