public class Java1 {
    public static void main (String[] args) {
        int num;
        System.out.print("Input a number: ");
        num = Integer.valueOf(System.console().readLine());

        if (num > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is 0 or negative");
        }
    }
}