/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Solution
 * Author:   62701
 * Date:     2020/5/30 17:07
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package ExerciseProblem9;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 62701
 * @create 2020/5/30
 * @since 1.0.0
 */
public class Solution {
    public int JumpFloorII(int target) {
        if (target == 0) {
            return 0;
        } else if (target == 1) {
            return 1;
        }
        int one = 1;
        int sum = 0;
        for (int i = 2; i < target + 1; i++) {
            sum = 2 * one;
            one = sum;
        }
        return sum;
    }
}