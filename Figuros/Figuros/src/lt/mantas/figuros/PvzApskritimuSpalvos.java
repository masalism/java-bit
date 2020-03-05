package lt.mantas.figuros;

import java.util.ArrayList;
import java.util.List;

public class PvzApskritimuSpalvos {

    public static void main(String[] args) {
        List<Circle> listas = new ArrayList<>();
        listas.add(new Circle(2, 255));
        listas.add(new Circle(10));
        listas.add(new Circle(20, 255));

        int x = kiekYraDuotosSpalvos(listas, 255);
        System.out.println("Viso radome " + x);

        List<Square> listas2 = new ArrayList<>();
        listas2.add(new Square(3,255));

        int j = kiekYraDuotosSpalvos(listas2, 255);
        System.out.println("Viso radome " + j);
    }

    static int kiekYraDuotosSpalvos(List<? extends Figure> list, int color) { // extendina figura bet kuri klase
        int count = 0;
        for (Figure c : list) {
            if (c.getColor() == color) {
                count++;
            }
        }
        return count;
    }
}
