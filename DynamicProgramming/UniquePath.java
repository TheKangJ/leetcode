/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: UniquePath
 * Author:   62701
 * Date:     2020/6/2 8:36
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package DynamicProgramming;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 62701
 * @create 2020/6/2
 * @since 1.0.0
 * <p>
 * 给出一个M * N的矩阵，一个人一从（0,0）到（m,n）处，一次只能走一步，总共有多少种方法。
 */
public class UniquePath {
    public static int UniquePaths(int m, int n) {
        int[][] ints = new int[m][n];
        for (int i = 0; i < m; i++) {  //top to bottom
            for (int j = 0; j < n; j++) {   // column: left to right
                if (i == 0 || j == 0) {
                    ints[i][j] = 1;
                } else {
                    ints[i][j] = ints[i - 1][j] + ints[i][j - 1];
                }
            }
        }
        return ints[m-1][n-1];
    }
}