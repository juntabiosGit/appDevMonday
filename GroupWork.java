public class GroupWork {
   // Group 1: Addition
    public static int add(int a, int b) {
        return a + b;
    }
   
    // Other groups will implement their methods here
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
       
        System.out.println("Sum: " + add(num1, num2));  // Group 1's method
       
        scanner.close();
    }
}
