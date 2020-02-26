package mantas.company;

import java.time.LocalDate;
import java.util.Objects;

class Primityvai {
    public static void main(String[] args) {
        byte b = 127;
        char c2 = 1;
        char c16 = 0xffff;
        char c8 = 0127577;
        char c = 65535;
        short s = 32767;
        int i = 100;
        long l = 2_000_000_000_000L;
        float f = 3.14f;
        double d = 2.41235;
        double d2 = 3.23e8; // 3.23 x 10^8;
        System.out.println(c - i);

        String password = "LabaiSlaptaszzz!";
        char[] chars = password.toCharArray();

        for (int index = 0; index < chars.length; index++) {
            chars[index]++;
        }

        String encoded = String.valueOf(chars);
        System.out.println(encoded);

        boolean testOr1 = btrue() || bfalse();
        boolean testOr2 = bfalse() || btrue();
        boolean testAnd1 = btrue() && bfalse();
        boolean testAnd2 = bfalse() && btrue();

//        int ii = (i = 0);
//        int ii = (i = 0);
        i = 10;
        System.out.println(i + ++i + --i + i++);

        LocalDate date1 = LocalDate.of(2020, 2, 19);
        LocalDate date2 = LocalDate.now();

        System.out.println(date1 + " = " + date2);
        System.out.println(date1 == date2);
        System.out.println(date1.equals(date2));

        System.out.println(compareDates(date1, date2));

        String name1 = "Jonas";
        String name2 = "Jonas";
        String name3 = "Jona";
        System.out.println(name1 == name2);
        System.out.println(name1 == "Jonas");
        System.out.println(name1 == ("Jona" + "s"));
        System.out.println(name1 == (name3 + 's'));
        System.out.println(name1.equals(name3 + 's'));

        if("Jonas".equals(name1)) {
            System.out.println("truegit");
        }
    }

    static boolean btrue() {
        System.out.println("b-true");
        return true;
    }

    static boolean bfalse() {
        System.out.println("b-false");
        return false;
    }

    static boolean compareDates(LocalDate d1, LocalDate d2) {
//        return d1.equals(d2);
        return Objects.equals(d1, d2);
//        return  (a == b) || (a != null && a.equals(b));
    }

}

