public class Java3 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        System.out.print("Input a first number: ");
        a = Integer.valueOf(System.console().readLine());
        System.out.print("Input a second number: ");
        b = Integer.valueOf(System.console().readLine());
        System.out.print("Input a third number: ");
        c = Integer.valueOf(System.console().readLine());

        if (a > b && a > c) {
            System.out.println("The greatest is first: " + a);
        } else if (b > a && b > c) {
            System.out.println("The greatest is second: " + b);
        } else if (c > b &&c > a) {
            System.out.println("The greatest is third: " + a);
        } else {
            System.out.println("All or two numbers are the Greatest");
        }
    }
}