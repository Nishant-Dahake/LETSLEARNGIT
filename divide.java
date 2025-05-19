public class Divide {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Divide <a> <b>");
            return;
        }
        try {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            if (b == 0) {
                System.out.println("Error: Division by zero is not allowed.");
            } else {
                double result = a / b;
                System.out.println("Result: " + result);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide valid numbers.");
        }
    }
}