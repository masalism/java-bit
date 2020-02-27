public class Testas {

    public static void main(String[] args) {

        Pasaulis pasaulis = new Pasaulis();

        Zmogus adomas = new Zmogus();
        Zmogus ieva = new Zmogus();
        adomas.amzius = 16;
        ieva.amzius = 16;

        pasaulis.pridetiZmogu(adomas);
        pasaulis.pridetiZmogu(ieva);
//
//        pasaulis.sendinameZmones();


        System.out.println(pasaulis.kiekYraZmoniu());

        long start, time;
        int kiekis, mire, gime;
        for (int i = 0; i < 1000; i++) {
            start = System.currentTimeMillis();
            pasaulis.ciklas();
            time = System.currentTimeMillis() - start;
            kiekis = pasaulis.kiekYraZmoniu();
            gime = pasaulis.kiekGime();
            mire = pasaulis.kiekMire();
            System.out.println(i + " yra zmoniu " + pasaulis.kiekYraZmoniu() + " " + time + " ms " + gime + " gime " + mire + " mire ");
            if (kiekis == 0) break;
        }
    }
}
