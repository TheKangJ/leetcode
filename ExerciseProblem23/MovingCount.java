package ExerciseProblem23;

/**
 * @author : 62701
 * @Title : MovingCount
 * @Description : 深度或者广度遍历
 * @date : 2020-08-01 15:21
 * @since : 1.0.0
 * <p>
 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，
 * 每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
 * 但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 **/

public class MovingCount {
    public static void main(String[] args) {
        System.out.println(movingCount(15,20,20));
    }

     public static int movingCount(int threshold, int rows, int cols) {
        if (threshold <= 0 || rows <= 0 || cols <= 0) {
            return 0;
        }
        boolean[][] flag = new boolean[rows][cols];
        int count = movingCountCore(threshold,rows,cols,0,0,flag);
        return count;
    }

    private static int movingCountCore(int threshold, int rows, int cols, int i, int j, boolean[][] flag) {
        if (threshold <= 0 || i < 0 || i >= rows || j < 0 || j >= cols || flag[i][j]) {
            return 0;
        } else if (check(i, j, threshold)) {
            flag[i][j] = true;
            return 1 + movingCountCore(threshold, rows, cols, i + 1, j, flag)
                    + movingCountCore(threshold, rows, cols, i, j + 1, flag);
//                    + movingCountCore(threshold, rows, cols, i - 1, j, flag)
//                    + movingCountCore(threshold,rows,cols,i,j-1,flag);
        } else {
            return 0;
        }
    }

     private static boolean check(int i, int j, int threshold) {
        if (i < 0 || j < 0 || threshold < 0) {
            return false;
        } else if ((i / 10 + i % 10 + j / 10 + j % 10) <= threshold) {
            return true;
        } else {
            return false;
        }
    }
}
