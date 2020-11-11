package ExerciseProblem24;

/**
 * @author : 62701
 * @Title : SolutionCorrect
 * @Description :
 * @date : 2020-08-03 14:16
 * @since : 1.0.0
 **/

public class SolutionCorrect {
    public static void main(String[] args) {
        char[] matrix = new char[]{'A','B','C','E','S','F','C','S','A','D','E','E'};
        char[] str = new char[]{'A','B','C','C','E','D'};
        System.out.println(hasPath(matrix,3,4,str));
    }

    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        //访问的标志位
        int[] flag = new int[matrix.length];
        //每一个都遍历
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                //0 是子串的起始位置
                if (ispath(matrix, rows, cols, i, j, str, 0, flag)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean ispath(char[] matrix, int rows, int cols, int i, int j, char[] str, int k, int[] flag) {
        // TODO Auto-generated method stub
        int index=i*cols+j;
        //如果matrix[index]!=str[k]  则返回false
        //如果flag[index]==1 说明已经访问过  则返回false
        if (i<0||j<0||i>=rows||j>=cols||matrix[index]!=str[k]||flag[index]==1) {
            return false;
        }
        if (k==str.length-1) {
            return true;
        }
        flag[index]=1;
        if (ispath(matrix, rows, cols,i-1, j, str, k+1, flag) ||ispath(matrix, rows, cols,i, j+1, str, k+1, flag)||
                ispath(matrix, rows, cols,i+1, j, str, k+1, flag)||ispath(matrix, rows, cols,i, j-1, str, k+1, flag))
        {
            return true;
        }
        flag[index]=0;
        return false;
    }
}
