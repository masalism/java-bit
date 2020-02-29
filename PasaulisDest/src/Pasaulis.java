import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Pasaulis extends Object {
    protected int JaunuoliaiAmzius = 20;
    protected double JaunuoliaiMirtingumas = 0.1;
    protected int TevuMinAmzius = 16;
    protected int TevuMaxAmzius = 50;
    protected double VaikuTikimybe = 10;
    List<Zmogus> zmones = new LinkedList<>();

    protected int gime = 0;
    protected int mire = 0;

    public Pasaulis (double jaunuoliuMirtingumas, double gimstamumas) {
        JaunuoliaiMirtingumas = jaunuoliuMirtingumas;
        VaikuTikimybe = gimstamumas;
    }

    public Pasaulis (double jaunuoliaiMirtingumas) {
        if (jaunuoliaiMirtingumas > 0 && jaunuoliaiMirtingumas < 10) {
            JaunuoliaiMirtingumas = jaunuoliaiMirtingumas;
        }
    }

    public Pasaulis (int tevuMinAmzius) {
        TevuMinAmzius = tevuMinAmzius;
    }

    public Pasaulis () {

    }

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
