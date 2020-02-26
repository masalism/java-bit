public class IfThenElse {

    public static void main(String[] args) {
        int a;
        int b;

        System.out.print("Iveskite pirma skaiciu: ");
        a = Integer.valueOf(System.console().readLine());
        System.out.print("Iveskite pirma skaiciu: ");
        b = Integer.valueOf(System.console().readLine());

        if (a > b) {
            System.out.println(a + " daugiau uz " + b);
        } else if (b > a) {
            System.out.println(b + " daugiau uz " + a);
        } else if (a == b) {
            System.out.println(a + " lygus " + b);
        }

 
    }
}