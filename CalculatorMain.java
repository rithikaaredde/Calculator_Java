/*
Name: Rithikaa Redde
PRN: 23070126101
Batch: B1
*/

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Welcome to Java Calculator!");
            System.out.println("Choose an operation:");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Square\n6. Cube\n7. Square Root");

            int choice = sc.nextInt();
            double a, b;

            switch (choice) {
                case 1:
                    System.out.println("Enter two numbers:");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result: " + Addition.add(a, b));
                    break;
                case 2:
                    System.out.println("Enter two numbers:");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result: " + Subtraction.subtract(a, b));
                    break;
                case 3:
                    System.out.println("Enter two numbers:");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result: " + Multiplication.multiply(a, b));
                    break;
                case 4:
                    System.out.println("Enter two numbers:");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result: " + Division.divide(a, b));
                    break;
                case 5:
                    System.out.println("Enter a number:");
                    a = sc.nextDouble();
                    System.out.println("Result: " + Square.square(a));
                    break;
                case 6:
                    System.out.println("Enter a number:");
                    a = sc.nextDouble();
                    System.out.println("Result: " + Cube.cube(a));
                    break;
                case 7:
                    System.out.println("Enter a number:");
                    a = sc.nextDouble();
                    System.out.println("Result: " + SquareRoot.squareRoot(a));
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } catch (ArithmeticException e) {
            System.out.println("Math Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Input Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
