package lt.mantas;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Mano mano = new Mano(10, 20, 99);
        for (Integer i : mano) {
            System.out.println(i);
        }

        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(4);
        l.add(6);

//        for (Integer i : l) {
//            System.out.println(i);
//        }

//        Iterator<Integer> iterator = l.iterator();
//
//        while (iterator.hasNext()) {
//            Integer i = iterator.next();
//            System.out.println(i);
//        }
    }
}
