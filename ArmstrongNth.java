/*
 * Problem: Print nth Armstrong number and all the Armstrong number b/w lower_limit and upper_limit.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongNth {

    // To find the square of number
    static int square(int n, int count) {

        int ans = 1;

        for (int i = 1; i <= count; i++) {
            ans *= n;
        }

        return ans;
    }

    // To count the number of digits
    static int countNum(int num) {

        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        return count;
    }

    // To check the number is Armstrong or not and if armstrong then print it.
    static int isArmstrong(int num) {

        int i = num, sum = 0;
        int count = countNum(num);

        while (i > 0) {
            int temp = i % 10;
            sum += square(temp, count);
            i /= 10;
        }

        if (num == sum)
            return num;
        return -1;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the nth number: ");
        int nth = sc.nextInt();

        int ans = 0;
        for (int i = a; i <= b; i++) {
            ans = isArmstrong(i);
            if (ans != -1) list.add(ans);
        }

        System.out.println(nth + " Armstrong numbers b/w " + a + " and " + b + " are "+ list.get(nth));

        list.remove(0);

        System.out.println("Armstrong numbers b/w " + a + " and " + b + " are "+ list);

        sc.close();
    }
}
