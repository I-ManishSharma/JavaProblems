import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Program to add digits of a number.
        /*System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int temp, sum = 0;

        while (num>0) {
            temp = num%10;
            sum += temp;
            num /= 10;
        }
        System.out.println(sum);
        */
        //Program to reverse a number.
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int temp =num, r, reverse = 0;
        while (temp>0) {
            r = temp%10;
            reverse = reverse*10+r;
            temp /=10;
        }
        System.out.println("Reverse of number "+num+" is "+reverse);
        sc.close();
    }
}