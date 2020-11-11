/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: JumpGame
 * Author:   62701
 * Date:     2020/6/2 9:17
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
 *
 * 有n块石头分别在X轴的0，1，。。。。，n-1位置
 * 一只青蛙在石头0，想跳到石头n-1
 * 如果青蛙在第i块石板上，他最多可以向右跳距离a[i]
 * 问青蛙能否跳到石头n-1
 *
 *
 *
 * 鼎泰规划的四个步骤
 * 1 .确定状态
 * -最后一步：如果青蛙能跳到最后一块石头n-1,我们考虑它跳的最后一步
 *
 * -这一步是从石头i跳过来，i<n-1
 *
 * -这需要两个条件同时满足：
 *  - 青蛙可以跳到石头i
 *  - 最后一步不超过跳跃的最大距离：n-1-i<a[i]
 *
 *
 *  2. 子问题
 *  - 那么，我们需要知道青蛙能不能跳到石头i(i<n-1)
 *
 *  - 而我们原来要求青蛙能不能跳到石头n-1
 *
 *  - 子问题
 *
 *  - 状态：设f[j]标识青蛙能不能跳到石头j
 *
 *  3. 转移方程
 *
 *  f[j] = OR(f[i] and i + a[i] >= j)
 */

public class JumpGame {
    public static boolean canJump(int[] A){

        // 0,1,2,3......m-1
        int m = A.length;
        //f[0],f[1],f[2],......f[m-1]
        Boolean[] f = new Boolean[m];
        f[0] = true;
        for (int i = 1; i <m ; i++) {
            f[i] = false;
            for (int j = 0; j <i ; j++) {
                if (f[j] && j + A[j]>= i){
                    f[i] = true;
                    break;
                }
            }
        }
        return f[m-1];
    }
}