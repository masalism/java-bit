package finder;

public class ArrayFinder   
{    
    public static int find(int[] array, int findVal) {
        int i = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] == findVal) {
                return i;
            }
        }
        return i;  
    }    

    public static int find(int[][] matrix, int findVal) {
        int i = 0;
        for (i = 0; i < matrix.length; i++) {
            for (int ii = 0; ii < matrix[i].length; ii++) {
                if (matrix[i][ii] == findVal) {
                    return i;
                }
            }
        }
        return i;  
    }
}