/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Solution
 * Author:   62701
 * Date:     2020/6/1 22:48
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
 * @create 2020/6/1
 * @since 1.0.0
 *
 * 假设有2块，5，块，7块的硬币无限多，现在要拼凑出27元钱，使得凑出的硬币最少，请问硬币最少有多少个
 */
public class SolutionCoinChange {
    //{2,5,7}   //27
    public static int coinChange(int[] A, int M) {

        //要计算f[0],f[1],.......f[n]
        int[] f = new int[M + 1];
        int n = A.length;  //number of kinds of coins

        // initialization
        f[0] = 0;
        //f[1],f[2],......f[27]
        for (int i = 1; i <= M; i++) {
            f[i] = Integer.MAX_VALUE;
            // last coin A[j]
            // f[i] = min{f[i-A[0]+1,.....,f[i-A[j]]+1}
            for (int j = 0; j < n; j++) {
                if (i > A[j] && f[i - A[j]] != Integer.MAX_VALUE) {
                    f[i] = Math.min(f[i - A[j]] + 1, f[i]);
                }
            }
        }
        if (f[M] == Integer.MAX_VALUE) {
            f[M] = -1;
        }
        return f[M];
    }
}