import java.util.*;
public class Samson{
    public static void display(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = sc.nextInt(); int nextAge = age + 1;
        System.out.println("Hello, Samson is contributing to this project!");
        System.out.println("Your Age next year is: "+nextAge);
        sc.close();
    }
}