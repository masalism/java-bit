
public class Uzd3 {

    public static void main(String[] args) {
        double a;
        double b;
        
        do {
            try {
                System.out.println("Iveskite pirma reiksme: ");
                a = Double.valueOf(System.console().readLine());
                System.out.println("Iveskite antra reiksme: ");
                b = Double.valueOf(System.console().readLine());
                System.out.println(a + " + " + b + " = " + (a + b));
                System.out.println(a + " - " + b + " = " + (a - b));
                System.out.println(a + " * " + b + " = " + (a * b));
                System.out.println(a + " / " + b + " = " + (a / b));
                System.out.println("");
            } catch (NumberFormatException e) {
                System.out.println(e);
            } 
            
            System.out.println("Jei norite testi, spauskite y");

        } while (System.console().readLine().equals("y"));
    }
}
