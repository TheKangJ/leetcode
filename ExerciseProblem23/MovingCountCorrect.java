package ExerciseProblem23;

/**
 * @author : 62701
 * @Title : MovingCountCorrect
 * @Description : 网上的答案
 * @date : 2020-08-02 12:30
 * @since : 1.0.0
 **/

public class MovingCountCorrect {
    public static void main(String[] args) {
        System.out.println(movingCount(15,20,20));
    }
    public static int movingCount(int threshold, int rows, int cols){
        boolean[][] helpMatrix = new boolean[rows][cols];
        return helpMethod(threshold, rows, cols, 0, 0, helpMatrix);
    }

    public static int helpMethod(int threshold, int rows, int cols, int i,int j, boolean[][] helpMatrix) {
        if(i>=rows || i<0 || j>=cols || j<0 || helpMatrix[i][j]==true) {
            return 0;
        }
        if(i/10+i%10+j/10+j%10 <= threshold) {
            helpMatrix[i][j] = true;
            return helpMethod(threshold, rows,cols, i+1, j, helpMatrix)
                    +helpMethod(threshold, rows,cols, i-1, j, helpMatrix)
                    +helpMethod(threshold, rows,cols, i, j+1, helpMatrix)
                    +helpMethod(threshold, rows,cols, i, j-1, helpMatrix)+1;
        }else {
            return 0;
        }
    }
}
