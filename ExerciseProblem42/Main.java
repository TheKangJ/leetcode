package ExerciseProblem42;

import java.util.Arrays;

/**
 * @author : 62701
 * @Title : Main
 * @Description :
 * @date : 2020-09-26 19:55
 * @since : 1.0.0
 **/

public class Main {
    public static void main(String[] args) {

    }
    public  static int kthSmallest(int[][] matrix,int k){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] sorted = new int[rows * cols];
        int index = 0;
        for (int[] row:matrix
             ) {
            for (int num:row
                 ) {
                sorted[index] = num;
                index++;
            }
        }
        Arrays.sort(sorted);
        return sorted[k-1];
    }
}
