package lt.mantas.figuros;

import java.util.ArrayList;
import java.util.List;

public class Uzdavinys2 {

    public static void main(String[] args) {
        List<Dimension> listas = new ArrayList<>();
        listas.add(new Square(6));
        listas.add(new Circle(10));
        listas.add(new Square(54));

//        listas.add(new Rectangular(54,54)); // klaida, nera implementuota

        for (Dimension d : listas) {
            d.dimensions(100);
        }

        for (Dimension d : listas) {
            if (d instanceof Circle) {
                Circle c = (Circle) d;
                System.out.println("Apskritimas spinduliu " + c.getR() + ", plotas = " + c.area());
            } else if (d instanceof Square) {
                Square c = (Square) d;
                System.out.println("Kvadratas krastine " + c.getWidth() + ", plotas = " + c.area());
            }
        }
    }
}