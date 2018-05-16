
package junittests;

/**
 *
 * @author Kevin's Account
 */
public class MathHelpers {
    public static double squareRoot(double number) {
        return Math.sqrt(number);
    }
    
    public static double getFactor(double number, int power) {
        return Math.pow(number, power);
    }
    
    public static double findMissingTriangleSide(double lengthA, double lengthB) {
        return squareRoot(getFactor(lengthA, 2) + getFactor(lengthB, 2));
    }
    
    public static double findPerimeterOfRectangle(double length, double width) {
        return (length * 2) + (width * 2);
    }
    
    public static double findAreaOfRectangle(double length, double width) {
        return length * width;
    }
}
