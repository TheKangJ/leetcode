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
package ExerciseProblem12;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 62701
 * @create 2020/5/30
 * @since 1.0.0
 * <p>
 * 输入一个整数数组，
 * 实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，
 * 偶数和偶数之间的相对位置不变。
 */
public class Solution {
    public static void reOrderArray(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {

            for (int j = length-1; j >i; j--) {
                if (array[j] % 2 == 1 && array[j-1] % 2 == 0) {
                    int temp;
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }

    }
}