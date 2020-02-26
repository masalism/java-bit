import java.math.BigInteger;

class Primityvai {
    public static void main(String[] args) {
        int x = 100;
        m(x);
        System.out.println(x);

        KlaseA a = new KlaseA();
        a.kintamasis1 = 100;
        a.kintamasis2 = true;
        KlaseA b = new KlaseA();

        n(a);
        c(b);
        System.out.println(a.kintamasis1 + " " + a.kintamasis2);
        System.out.println(b.kintamasis1 + " " + b.kintamasis2);
        a = b;
        System.out.println(a.kintamasis1 + " " + a.kintamasis2);

        String vardas1 = "Jonas";
        String vardas2 = vardas1;
        vardas1 = "Petras";
        System.out.println(vardas1);

//        long j = 1;
//        for (int i = 0; i < 64; i++) {
//            j = j * 2;
//            System.out.println(j);
//        }
//        System.out.println(j);
        long N = 1;
        System.out.println(sachmatai());
    }

    static int m(int x) {
        x = 200;
        return x;
    }

    static void n (KlaseA x) {
        x.kintamasis1 = 200;
        x.kintamasis2 = false;
    }

    static void c (KlaseA x) {
        x.kintamasis1 = 432400;
        x.kintamasis2 = false;
    }

    static BigInteger sachmatai () {
        BigInteger a = new BigInteger("1");

        for (int i = 0; i < 64; i++) {
            a = a.multiply(BigInteger.valueOf(2));
            System.out.println(a);

        }
        return a;
    }

}

class KlaseA {
    int kintamasis1;
    boolean kintamasis2;
}

