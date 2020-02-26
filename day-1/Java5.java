import java.util.Scanner;

class Java5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number: ");
        int first = sc.nextInt();
        System.out.println("Input second number: ");
        int second = sc.nextInt();
        int result = first * second;
        System.out.println(result);

    }
}