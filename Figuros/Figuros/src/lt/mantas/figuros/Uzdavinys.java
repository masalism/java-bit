package lt.mantas.figuros;

import java.util.ArrayList;
import java.util.List;

public class Uzdavinys {

    public static void main(String[] args) {
        List<Figure2D> figures = new ArrayList<>();
        // figures.add(new Figure());
        figures.add(new Circle(10));
        figures.add(new Circle(9.9));
        figures.add(new Square(20));
        figures.add(new Rectangular(4, 36));

        Figure2D f = rastiMaziausioPlotoFigura(figures);
        System.out.println("Maziausias plotas yra " +
                translate(f.getClass().getSimpleName()) + " " + f.area());
    }

    private static Figure2D rastiDidziausioPlotoFigura(List<Figure2D> figures) {
        // 1. paimti kintamaji kuriame bus padeta ta surasta reiksme
        // ir priskiriam jam pradine reiksme 'null'
        Figure2D maxPlotoFigura = null;

        // 2. Sukam cikla per figuru sarasa
        for (Figure2D f : figures) {

            // 3. Priskirti pacia pirma figura is saraso
            if (maxPlotoFigura == null) {
                maxPlotoFigura = f;
                continue;
            }

            // 4. Tikriname ar figuros (f) is saraso plotas yra didesnis uz
            // jau pasiimtos (maxPlotoFigura) figuros plota
            if (f.area() > maxPlotoFigura.area()) {
                maxPlotoFigura = f;
            }
        }

        // 5. Grazina rasta figura
        return maxPlotoFigura;
    }

    private static Figure2D rastiMaziausioPlotoFigura(List<Figure2D> figures) {
        Figure2D minPlotoFigura = null;
        for (Figure2D f : figures) {
            if (minPlotoFigura == null) {
                minPlotoFigura = f;
                continue;
            }
            if (f.area() < minPlotoFigura.area()) {
                minPlotoFigura = f;
            }
        }
        return minPlotoFigura;
    }

    static String translate(String s) {
        String result = "?";
        switch (s) {
            default:
                result = "Belenkas";
                break;
            case "Circle":
            case "A":
                result = "Apskritimas";
                break;
            case "Rectangular":
                result = "Staciakampis";
                break;
            case "Square":
                result = "Kvadratas";
        }
        return result;
    }
}
