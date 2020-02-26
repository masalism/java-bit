import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Pasaulis
//        duomenys/klases kintamieji:
//        - zmoniu sarasas
//        veiksmai/metodai:
//        - auga metai
//        - zmones mirsta
//        - kai amzius < 20, mirties tikimybe 0.1%
//        - kai amzius < 30, mirties tikimybe 0.5%
//        - kai amzius < 50, mirties tikimybe 10%
//        - kai amzius < 60, mirties tikimybe 20%
//        - >= 60, mirties tikimybe 30%
//        - zmones gimsta
//        - populiacija > 18 iki < 40, tikimybe 10%
//        - kiek yra zmoniu
public class Pasaulis {

    List<Zmogus> zmones = new ArrayList<>();
    List<Zmogus> kapines = new ArrayList<>();
    Random random = new Random();

    void gimstaZmones() {
        Zmogus zmogus = new Zmogus();
        for (int i = 0; i < zmones.size(); i++) {
            int n = random.nextInt(10);
            n += 1;
            if (n == 1) {
                zmones.add(zmogus);
            }
        }
    }

    void pridetiZmogu (Zmogus z) {
        zmones.add(z);
    }

    void sendinameZmones() {
        for (Zmogus zmogus : zmones) {
            zmogus.amzius++;
        }
    }

    int kiekYraZmoniu() {
        return zmones.size();
    }

    void mirstaZmones () {
        Zmogus mire = new Zmogus();
        for (Zmogus zmogus : zmones) {
            int n = random.nextInt(1000);
            n += 1;
            if (zmogus.amzius < 20 && (n > 0 || n < 11)) {
                kapines.add(mire);
            } else if (zmogus.amzius < 30 && (n > 0 || n < 51)) {
                kapines.add(mire);
            } else if (zmogus.amzius < 50 && (n > 0 || n < 101)) {
                kapines.add(mire);
            } else if (zmogus.amzius < 60 && (n > 0 || n < 201)) {
                kapines.add(mire);
            } else if (zmogus.amzius >= 60 && (n > 0 || n < 301)) {
                kapines.add(mire);
            }
        }

        System.out.println(kapines.size());
        kapines.removeAll(zmones);
    }
}