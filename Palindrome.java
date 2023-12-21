import java.util.Scanner;

public class Palindrome {
    //Program to check a string is Palindrome or not.

    static boolean checkString(String str) {
        int left = 0, right = str.length()-1;
        while (left<right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        
        if(checkString(str)) {
            System.out.println("String is Palindeome.");
        } else {
            System.out.println("String is not Palindrome.");
        }

        sc.close();
    }
}
