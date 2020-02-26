import java.util.Scanner;

class Java6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        int first = sc.nextInt();
        System.out.print("Input second number: ");
        int second = sc.nextInt();
        
        System.out.println(first + " + "+ second+ " = " + (first + second));
        System.out.println(first + " - "+ second+ " = " + (first - second));
        System.out.println(first + " * "+ second+ " = " + (first * second));
        System.out.println(first + " / "+ second+ " = " + (first / second));
    }
}