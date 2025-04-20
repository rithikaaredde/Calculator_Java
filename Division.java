// Class for Division functionality
public class Division {
    public static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero.");
        return a / b;
    }
}
