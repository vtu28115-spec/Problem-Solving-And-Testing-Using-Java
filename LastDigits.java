
import java.util.Scanner;

public class LastDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        // Find the sum of their last digits
        int totalSum = sumOfLastDigits(num1, num2);
        
        // Display the result
        System.out.println("Sum of the last digits: " + totalSum);
        
        scanner.close();
    }

    public static int sumOfLastDigits(int input1, int input2) {
        // Math.abs handles negative numbers correctly by returning absolute value
        int lastDigit1 = Math.abs(input1 % 10); 
        int lastDigit2 = Math.abs(input2 % 10);
        
        return lastDigit1 + lastDigit2;
    }
}

