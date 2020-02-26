import java.util.Scanner;

public class DideliSkaiciai {

    // 1235789003
    //     ...210
    byte[] skaiciukas = new byte[50];  // 0 0 0 0 0 0 0 0 0 ... 0 0 0

    public DideliSkaiciai(byte[] pradiniai) { // 1 2 3
        for (int i = 0; i < pradiniai.length; i++) {
            skaiciukas[i] = pradiniai[i];
        }
    }

    // tekstas: "8124"
    // byte:     4218
    public DideliSkaiciai(String tekstas) {
        int k = 0;
        for (int i = tekstas.length() - 1; i >= 0; i--) {
            skaiciukas[k++] = (byte) (tekstas.charAt(i) - '0');
        }
    }

    //   12423345456
    //           x 3
    //   -----------
    //         ..168

    // 5 * 3 = 15
    // 4 * 6 = 24
    void daugintiIs(int skaicius) {
        int mintis = 0;
        for (int i = 0; i < skaiciukas.length; i++) {
            int resultatas = skaiciukas[i] * skaicius + mintis;
            mintis = resultatas / 10;
            skaiciukas[i] = (byte) (resultatas % 10);
        }
    }

    void prideti(DideliSkaiciai dideliSkaiciai) {
        int mintis = 0;
        for (int i = 0; i < skaiciukas.length; i++) {
            int resultatas = skaiciukas[i] +
                    dideliSkaiciai.skaiciukas[i] +
                    mintis;
            mintis = resultatas / 10;
            skaiciukas[i] = (byte) (resultatas % 10);
        }
    }

    void spausdinti() {
        for (int i = skaiciukas.length - 1; i >= 0; i--) {
            System.out.print(skaiciukas[i]);
        }
        System.out.println();
    }

    void spBeNuliuPriekyje() {
        boolean pradzia = false;
        for (int i = skaiciukas.length - 1; i >= 0; i--) {
            if (skaiciukas[i] > 0 || pradzia == true) {
                System.out.print(skaiciukas[i]);
                pradzia = true;
            }
        }
        System.out.println();
    }
}

class TestuojameDideliusSkaicius {
    public static void main(String[] args) {

        DideliSkaiciai dideliSkaiciai = new DideliSkaiciai(new byte[]{6, 0, 8});
        dideliSkaiciai.spausdinti();

        dideliSkaiciai.daugintiIs(5);
        dideliSkaiciai.spausdinti();

        dideliSkaiciai.prideti(new DideliSkaiciai(new byte[]{9, 8, 7}));
        dideliSkaiciai.spausdinti();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pirmas didelis skaicius:");
        String pirmas = scanner.next();
        System.out.println("Antras didelis skaicius:");
        String antras = scanner.next();

        DideliSkaiciai skaicius1 = new DideliSkaiciai(pirmas);
        DideliSkaiciai skaicius2 = new DideliSkaiciai(antras);

        skaicius1.spausdinti();
        skaicius2.spausdinti();
        skaicius1.prideti(skaicius2);
        skaicius1.spausdinti();
    }
}