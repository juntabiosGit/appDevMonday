import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Calling methods from Calculator.java

        System.out.println(Calculator.max(num1, num2));  // Group 8's method

        System.out.println("Sum: " + Calculator.add(num1, num2));  // Group 1's method

        System.out.println("Squared " + Calculator.square(num1)); //Group 6's method
		
		
		
		
		
		
		
		
		System.out.println("Quotient: " + Calculator.divide(num1, num2));  // Group 4's method

        System.out.println("Difference: " + Calculator.subtract(num1, num2));  // Group 2's method

        System.out.println("Are numbers equal? " + Calculator.isEqual(num1, num2));  // Group 10's method


        System.out.println("Smaller Number is: " + Calculator.isSmall(num1, num2)); //Group 9's method

        scanner.close();
    }
