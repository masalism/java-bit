package lt.mantas.figuros;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Figure f = new Figure();
        f.setColor(256);

        f.setX(100);
        f.setY(-50);

        System.out.println(f.getColor());

        List<Figure> listas = new ArrayList<>();
        listas.add(new Figure());
        listas.add(new Figure());
        listas.add(new Circle(10));



        System.out.println("Bendras plotas yra " + plotai(listas));
    }

    static double plotai(List<Figure> figuros) {
        double bendrasPlotas = 0;
        for (Figure f : figuros) {
            bendrasPlotas += f.area();
        }
        return bendrasPlotas;
    }
}
