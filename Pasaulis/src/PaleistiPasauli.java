public class PaleistiPasauli {
    public static void main(String[] args) {
        Pasaulis pasaulis = new Pasaulis();
        Zmogus pirmasZmogus = new Zmogus();
        Zmogus antrasZmogus = new Zmogus();

        pasaulis.pridetiZmogu(pirmasZmogus);
        pasaulis.pridetiZmogu(antrasZmogus);

        for (int i = 0; i < 100; i++) {
            pasaulis.sendinameZmones();
            pasaulis.gimstaZmones();
            pasaulis.mirstaZmones();
        }

        System.out.println("Gyvu zmoniu " + pasaulis.kiekYraZmoniu());
    }
}