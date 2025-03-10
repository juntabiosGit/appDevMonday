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

        scanner.close();
    }
}
