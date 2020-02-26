
public class Uzd2 {

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4, 5, }, { 10, 20, 30, 40, 50 }, { 100, 200, 300, 400, 500 } };

        int[] skaiciai = { 1, 3, 5, 8, 43, 2, 876, 32, 4, 765, 54 };

        findIndex(matrix, 200);
        findIndex(matrix, 100);
        findIndex(matrix, 1);
        findIndex(matrix, 50);
        findIndex(skaiciai, 876);
    }

    public static void findIndex(int[][] matrix, int findVal) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] == findVal)
                    System.out.println(findVal + " Eilutes indeksas yra " + i + " , o stulpelio indeksas yra " + j);
            }
        }
    }

    public static void findIndex(int[] matrix, int findVal) {

        for (int i = 0; i < matrix.length; i++) {

            if (matrix[i] == findVal)
                System.out.println(findVal + " Eilutes indeksas yra " + i);

        }
    }
}
