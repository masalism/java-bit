public class Java4 {
    public static void main(String[] args) {
        double num;
        System.out.print("Input a first number: ");
        num = Double.valueOf(System.console().readLine());
        
        if (num > 0) {
            if (num < 1) {
                System.out.println("Positive small number: " + num);
            } else if (num > 1000000) {
                System.out.println("Positive large number: " + num);
            } else {
                System.out.println("Positive number: " + num);
            }
        } else if (num < 0) {
            if (num > -1) {
                System.out.println("Negative small number: " + num);
            } else if (num < -1000000) {
                System.out.println("Negative large number: " + num);
            } else {
                System.out.println("Negative number: " + num);
            }
        } else if (num == 0) {
            System.out.println("Number is 0");
        }
    }
}