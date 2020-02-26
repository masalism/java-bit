public class WhereValInMatrix    
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

    public static void main(String[] args) {     
        int[][] matrix = {
            {1, 2, 3, 4, 5},
            {10, 20, 30, 40, 50},
            {100, 200, 300, 400, 500}
        };

        int[][] matrixOne = {
            {1, 2, 3, 4, 5},
            {10, 20, 30, 40, 50},
            {100, 200, 300, 400, 500}
        };
          
        int valueToFind = 300;
        
        int rowIndex = WhereValInMatrix.find(matrix, valueToFind);  
        System.out.println(rowIndex);
    }    
}