// Class for Square Root functionality
public class SquareRoot {
    public static double squareRoot(double a) throws IllegalArgumentException {
        if (a < 0) throw new IllegalArgumentException("Cannot calculate square root of a negative number.");
        return Math.sqrt(a);
    }
}
