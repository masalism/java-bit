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
public class Pasaulis extends Object {
    private int JaunuoliaiAmzius = 20;
    private double JaunuoliaiMirtingumas = 0.1;
    private int TevuMinAmzius = 16;
    private int TevuMaxAmzius = 50;
    private double VaikuTikimybe = 10;

    private int gime = 0;
    private int mire = 0;

    public Pasaulis (double jaunuoliuMirtingumas, double gimstamumas) {
        JaunuoliaiMirtingumas = jaunuoliuMirtingumas;
        VaikuTikimybe = gimstamumas;
    }

    public Pasaulis (double jaunuoliaiMirtingumas) {
        if (jaunuoliaiMirtingumas > 0 && jaunuoliaiMirtingumas < 10) {
            JaunuoliaiMirtingumas = jaunuoliaiMirtingumas;
        }
    }

    public  Pasaulis (int tevuMinAmzius) {
        TevuMinAmzius = tevuMinAmzius;
    }

    public Pasaulis () {

    }


    List<Zmogus> zmones = new ArrayList<>();

    void pridetiZmogu(Zmogus z) {
        zmones.add(z);
    }

    private void sendinameZmones() {
        for (Zmogus zmogus : zmones) {
            zmogus.amzius++;
        }
    }

    int kiekYraZmoniu() {
        return zmones.size();
    }

    private void zudynes() {
        List<Zmogus> kapines = new ArrayList<>();
        for (Zmogus z : zmones) {
            if (z.amzius < JaunuoliaiAmzius) {
                if (Math.random() < JaunuoliaiMirtingumas / 100.0) { // 0.1%
                    kapines.add(z);
                }
            } else if (z.amzius < 30) {
                if (Math.random() < 10 / 100.0) { // 10%
                    kapines.add(z);
                }
            } else if (z.amzius < 50) {
                if (Math.random() < 5 / 100.0) { // 5%
                    kapines.add(z);
                }
            } else {
                if (Math.random() < 25 / 100.0) { // 25%
                    kapines.add(z);
                }
            }
        }
        zmones.removeAll(kapines);
        mire = kapines.size();
    }

    private void gimimai() {
        List<Zmogus> naujagimiai = new ArrayList<>();
        for (Zmogus z : zmones) {
            if (z.amzius >= 16 && z.amzius < 50) {
                if (Math.random() < VaikuTikimybe / 100.0) { // 10%
                    naujagimiai.add(new Zmogus());
                }
            }
        }
        zmones.addAll(naujagimiai);
        gime = naujagimiai.size();
    }

    public void ciklas() {
        sendinameZmones();
        zudynes();
        gimimai();
    }

    public int kiekGime () {
        return gime;
    }

    public int kiekMire () {
        return mire;
    }

}
