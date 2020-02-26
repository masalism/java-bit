public class Java2 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        System.out.print("Input a first number: ");
        a = Double.valueOf(System.console().readLine());
        System.out.print("Input a second number: ");
        b = Double.valueOf(System.console().readLine());
        System.out.print("Input a third number: ");
        c = Double.valueOf(System.console().readLine());

        double result = b * b - 4.0 * a * c;

        if (result > 0.0) {
            double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if (result == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}