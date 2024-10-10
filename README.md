
public class DivisionErrorHandling {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0; 

        try {
            // Code that may throw an exception
            int result = divide(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Code that runs regardless of an exception
            System.out.println("Division operation completed.");
        }
    } 

    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
