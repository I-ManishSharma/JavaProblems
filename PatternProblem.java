public class PatternProblem {
    
    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern6(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = i-1; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = n-i+1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        } 
    }

    static void pattern8(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");                    
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        int count = 1;
        for (int i = n; i >= 1; i--) {
            for (int j = i-1; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = n-i+1; j >= 1; j--) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    static void pattern10(int n) {
        for (int i = 1; i <= n; i++) {
            int c = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c = c * (i - j) / j;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Pattern 1");
        pattern1(n);
        System.out.println("Pattern 2");
        pattern2(n);
        System.out.println("Pattern 3");
        pattern3(n);
        System.out.println("Pattern 4");
        pattern4(n);
        System.out.println("Pattern 5");
        pattern5(n);
        System.out.println("Pattern 6");
        pattern6(n);
        System.out.println("Pattern 7");
        pattern7(n);
        System.out.println("Pattern 8");
        pattern8(n);
        System.out.println("Pattern 9");
        pattern9(4);
        System.out.println("Pattern 10");
        pattern10(n);
    }
}
