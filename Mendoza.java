import java.util.Scanner;

public class Mendoza {
    public static void display() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        int nextYearAge = age + 1;
       
        System.out.println("Hello! This is Mendoza contributing to the project.");
        System.out.println("Your age next year will be: " + nextYearAge);
       
        scanner.close();
    }
}
