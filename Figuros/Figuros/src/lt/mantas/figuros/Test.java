package lt.mantas.figuros;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Perimeter> listas = new ArrayList<>();
//        // listas.add(new Cube(10)); -- klaida nes Cube neimplementuoja Perimeter
//        listas.add(new Circle(10));
//        listas.add(new Rectangular(10, 20));
//        listas.add(new Square(5));
//        System.out.println("Bendras perimetras yra " + perimetrai(listas));

        List<Area> listasPlotu = new ArrayList<>();
        listasPlotu.add(new Cube(10));
        listasPlotu.add(new Circle(10));
        listasPlotu.add(new Rectangular(10, 20));
        listasPlotu.add(new Square(5));
        System.out.println("Bendras plotas yra " + plotai(listasPlotu));

        Cube kubas = new Cube(123);
        Object objectas = kubas;
        Area areasas = kubas;
    }

    static double perimetrai(List<Perimeter> figuros) {
        double bendrasPerimetras = 0;
        for (Perimeter f : figuros) {
            bendrasPerimetras += f.perimeter();
        }
        return bendrasPerimetras;
    }

    static double plotai(List<Area> figuros) {
        double bendrasPlotas = 0;
        for (Area f : figuros) {
            bendrasPlotas += f.area();
        }
        return bendrasPlotas;
    }
}
