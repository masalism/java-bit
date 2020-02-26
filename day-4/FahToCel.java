// import java.util.Scanner;
class FahToCel {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        double fahrenheit;
        double celsius;

        System.out.print("Input degree in Fahrenheit: ");

        // fahrenheit = sc.nextDouble();
        fahrenheit = Double.valueOf(System.console().readLine());

        celsius = ((5 * (fahrenheit - 32.0)) / 9.0);

        System.out.println(fahrenheit + " fahrenheit in celsius is " + celsius);
    }
}