package ExerciseProblem24;

/**
 * @author : 62701
 * @Title : HasPath
 * @Description :
 * @date : 2020-08-02 13:04
 * @since : 1.0.0
 * <p>
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 * 路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
 * 如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。
 * 例如
 * a b c e
 * s f c s
 * a d e e
 * 矩阵中包含一条字符串"bcced"的路径，但是矩阵中不包含"abcb"路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子。
 * <p>
 * <p>
 * A B C E
 * S F C S
 * A D E E
 **/

public class Solution {
    public static void main(String[] args) {
        char[] matrix = new char[]{'A', 'B', 'C', 'E', 'S', 'F', 'C', 'S', 'A', 'D', 'E', 'E'};
        char[] str = new char[]{'A', 'B', 'C', 'C', 'E', 'D'};
        System.out.println(hasPath(matrix, 3, 4, str));
    }

    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if (matrix.length <= 0 || rows <= 0 || cols <= 0 || str.length <= 0) {
            return false;
        }
        boolean[] flag = new boolean[matrix.length];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (isPath(matrix, rows, cols, i, j, str, 0, flag)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isPath(char[] matrix, int rows, int cols, int i, int j, char[] str, int k, boolean[] flag) {
        int index = i * cols + j;

        if (i < 0 || j < 0 || i >= rows || j >= cols || flag[index] || matrix[index] != str[k]) {
            return false;
        }
        if (k == str.length - 1) {
            return true;
        }
        flag[index] = true;
        if (isPath(matrix, rows, cols, i + 1, j, str, k + 1, flag) ||
                isPath(matrix, rows, cols, i - 1, j, str, k + 1, flag) ||
                isPath(matrix, rows, cols, i, j + 1, str, k + 1, flag) ||
                isPath(matrix, rows, cols, i , j-1, str, k + 1, flag)
        ) {
            return true;
        } else {
            flag[index] = false;
            return false;
        }
    }
}
