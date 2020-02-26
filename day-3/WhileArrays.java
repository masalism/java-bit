public class WhileArrays {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6 };
        int[][] rows = { 
            { 1, 2, 3, 4, 5, 6 },
            { 3, 8, 9, 3, 2, 9 } 
        };
       
        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }

        int j = 0;
        // while (j < row.length) {
        //     int g = 0;
        //     while (g < row[j].length) {
        //         System.out.println("row: " + i + " col: " + j + " = " +  rows[j][g]);
        //         g++;
        //     }
        //     j++;
        // }

        for (int number : numbers) {
            System.out.println(number);
        }

        int a;
        int b;
        int sum;

        do {
            System.out.println("Enter a: ");
            a = Integer.valueOf(System.console().readLine());
            System.out.println("Enter b: ");
            b = Integer.valueOf(System.console().readLine());
            sum = a + b;
            System.out.println("Sum is: " + sum);
            System.out.println("Continue (y/n)");
        } while (System.console().readLine().equals("y"));
    }
}