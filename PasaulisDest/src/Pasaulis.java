import java.util.ArrayList;
import java.util.List;

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
}
