import java.util.Scanner; // Import the Scanner class

public class Task5 {
    public static void function1(Scanner scanner) { // Pass scanner as a parameter
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        // Do not close the scanner here as it's being used in main
    }

    public static void function2(int number) {
        int count = number / 5;
        System.out.println("The number " + number + " can be divided by 5, " + count + " times.");
    }

    public static int function3(int number1, int number2) {
        int sum = number1 * number2;
        System.out.println("The sum of the 2 numbers is: " + sum); // Print the message here
        return sum;
    }

    public static double function4(int num1, int num2, int num3) { // Changed return type to double
        int sum = num1 + num2 + num3;
        System.out.println("The sum is: " + sum);
        return sum / 3.0; // This will now return a double
    }

    public static void function5(double radius) {
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("For a circle with radius " + radius + ":");
        System.out.println("Circumference is: " + circumference);
        System.out.println("Area is: " + area);
    }

    public static double function6(double a, double b) { // Fixed the missing comma
        return Math.sqrt(a * a + b * b);
    }

    public static void function7(char first, char middle, char last) {
        System.out.print("" + last + middle + first);
    }

    public static int function8(int firstNumber, int difference, int termNumber) { // Changed to int and fixed parameters
        return firstNumber + (termNumber - 1) * difference;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        function1(scanner); // Pass the scanner to the function

        System.out.print("Enter a number: ");
        int num1 = scanner.nextInt(); // Read as int
        function2(num1);

        System.out.print("Enter a number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter another number: ");
        int num3 = scanner.nextInt();
        function3(num2, num3);

        // Prompting the user to enter three numbers
        System.out.println("Enter the first number:");
        int num4 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int num5 = scanner.nextInt();
        System.out.println("Enter the third number:");
        int num6 = scanner.nextInt();
        double average = function4(num4, num5, num6); // Store the returned average
        System.out.println("The average is: " + average);

        System.out.println("Enter a radius:");
        double radius = scanner.nextDouble(); // Use nextDouble
        function5(radius);

        System.out.println("Enter the length of side a:");
        double a = scanner.nextDouble();
        System.out.println("Enter the length of side b:");
        double b = scanner.nextDouble();
        double hypotenuse = function6(a, b);
        System.out.println("The hypotenuse is: " + hypotenuse);

        scanner.nextLine(); // Consume the leftover newline

        System.out.println("Enter the first letter:");
        char first = scanner.next().charAt(0);
        System.out.println("Enter the second letter:");
        char middle = scanner.next().charAt(0);
        System.out.println("Enter the third letter:");
        char last = scanner.next().charAt(0);
        function7(first, middle, last);

        scanner.nextLine(); // Consume the leftover newline

        System.out.println("Enter the first number of the arithmetic series:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the common difference of the series:");
        int difference = scanner.nextInt();
        System.out.println("Enter the term number of the series:");
        int termNumber = scanner.nextInt();
        int nthTerm = function8(firstNumber, difference, termNumber);
        System.out.println("The " + termNumber + "th term of the series is: " + nthTerm);

        scanner.close(); // Close the scanner at the end of the main method
    }
}
