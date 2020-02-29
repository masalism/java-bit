import java.util.ArrayList;
import java.util.List;

public class NaujasPasaulis extends Pasaulis {

    @Override
    public void ciklas() {
        int zmoniuSk = zmones.size();
        List<Zmogus> kapines = new ArrayList<>(zmoniuSk);
        List<Zmogus> naujagimiai = new ArrayList<>(zmoniuSk);
        for (Zmogus z : zmones) {
            //sendinam
            z.amzius++;
            //zudynes
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

            //gimimai
            if (z.amzius >= 16 && z.amzius < 50) {
                if (Math.random() < VaikuTikimybe / 100.0) { // 10%
                    naujagimiai.add(new Zmogus());
                }
            }
        }
        zmones.removeAll(kapines);
        zmones.addAll(naujagimiai);
        gime = naujagimiai.size();
        mire = kapines.size();
    }
}
