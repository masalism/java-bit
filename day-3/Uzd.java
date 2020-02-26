public class Uzd {

    public static void main(String[] args) {
        int[] mas = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        String sequenstialLiteral = " sequence";
        String result = "";
        int upAccumulator = 0;
        int downAccumulator = 0;
        int index = 5;

        int previousVal = mas[0];

        for (int i = 0; i < mas.length; i++) {
            if (previousVal < mas[i]) {
                upAccumulator ++;
            }
            if (previousVal > mas[i]) {
                downAccumulator ++;
            }
            previousVal = mas[i];
        }

        if (downAccumulator != 0 && upAccumulator !=0) {
            result = "Not a";
        } else if (downAccumulator > 0 && upAccumulator == 0) {
            result = "Down";
        } else if (upAccumulator > 0 && downAccumulator ==0) {
            result = "Up";
        }

        System.out.println("Result is " + result + sequenstialLiteral);
        // String kokiaSeka = "Neaisku";
        // for (int i = 0; i < mas.length - 1; i++) {
        //     int pirmas = mas[i];
        //     int sekantis = mas[i + 1];

        //     if (pirmas < sekantis) {
        //         System.out.println(pirmas + ",  " + sekantis);
        //         kokiaSeka = "Didejantis";
        //     } else {
        //         kokiaSeka = "Nerusiuotas";
        //         System.out.println(pirmas + ",  " + sekantis);
        //         break;
        //     }
        // }

        // System.out.println(kokiaSeka);

        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.println(mas[i]);
        }

        for (int i = 0; i < mas.length - 1; i++) {
            if (index == mas[i]) {
                System.out.println(mas[i] + " reiksmes index yra " + i);
            }
        }

        for (int i = 0; i < mas.length - 1; i += 2) {
            System.out.println(mas[i]);
        }
    }
}