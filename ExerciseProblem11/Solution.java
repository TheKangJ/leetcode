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
package ExerciseProblem11;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 62701
 * @create 2020/5/30
 * @since 1.0.0
 *
给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。

保证base和exponent不同时为0

 */
public class Solution {
    public static double Power(double base, int exponent) {
        double number = 1;
        if (exponent == 0){
            return number;
        }else if (exponent > 0){
            for (int i = 0; i <exponent ; i++) {
                number = number * base;
            }
            return number;
        }else{
            return 1/Power(base,0-exponent);
        }
    }
}