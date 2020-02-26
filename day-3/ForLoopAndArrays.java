public class ForLoopAndArrays {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6 };
        int[][] rows = { 
            { 1, 2, 3, 4, 5, 6 },
            { 3, 8, 9, 3, 2, 9 } 
        };
       
        for (int i =0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        for (int i =0; i < rows.length; i++) {
            // System.out.println(rows[i]);
            for(int j = 0; j < rows[i].length; j++) {
                System.out.println("row: " + i + " col: " + j + " = " +  rows[i][j]);
            }
        }
    }
}