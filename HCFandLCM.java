import java.util.Scanner;

public class HCFandLCM {

    static int findHcf(int a, int b) {
        while (b>0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int findLcm(int a, int b, int hcf) {
        return a * b / hcf;
    }

    //program to find HCF and LCM of two numbers

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        int hcf = findHcf(num1,num2);
        int lcm = findLcm(num1,num2,hcf);
        System.out.println("HCF of "+num1+" and "+num2+" is: "+ hcf);
        System.out.println("LCM of "+num1+" and "+num2+" is: "+ lcm);
        sc.close();
    }
}
