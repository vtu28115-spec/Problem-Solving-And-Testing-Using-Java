import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {

    public PerformOperation isOdd() {
        return (n) -> n % 2 != 0;
    }

    public PerformOperation isPrime() {
        return (n) -> {
            if (n < 2) {
                return false;
            }

            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        };
    }

    public PerformOperation isPalindrome() {
        return (n) -> {
            int original = n;
            int reverse = 0;

            while (n > 0) {
                int digit = n % 10;
                reverse = reverse * 10 + digit;
                n = n / 10;
            }

            return original == reverse;
        };
    }
}

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MyMath myMath = new MyMath();

        int T = sc.nextInt();

        while (T-- > 0) {

            int condition = sc.nextInt();
            int number = sc.nextInt();

            PerformOperation operation;

            if (condition == 1) {
                operation = myMath.isOdd();

                if (operation.check(number)) {
                    System.out.println("ODD");
                } else {
                    System.out.println("EVEN");
                }

            } else if (condition == 2) {
                operation = myMath.isPrime();

                if (operation.check(number)) {
                    System.out.println("PRIME");
                } else {
                    System.out.println("COMPOSITE");
                }

            } else if (condition == 3) {
                operation = myMath.isPalindrome();

                if (operation.check(number)) {
                    System.out.println("PALINDROME");
                } else {
                    System.out.println("NOT PALINDROME");
                }
            }
        }

        sc.close();
    }
}