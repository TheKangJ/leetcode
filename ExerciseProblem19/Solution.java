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
package ExerciseProblem19;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 62701
 * @create 2020/5/30
 * @since 1.0.0
 */
public class Solution {
    public static Integer[] find(Integer[] nums){
        Integer[] ret = new Integer[3];
        int sum = 0;
        for (int i = 0; i <nums.length ; i++) {
            sum = sum +nums[i];
        }
        int avr = sum/nums.length;

        Integer[] distance = new Integer[10];
        for (int i = 0; i <nums.length ; i++) {
            distance[i] = Math.abs(nums[i]-avr);
        }
        int i = 0;
        Integer[] flag = new Integer[3];
        Integer[] retflag = new Integer[3];
        while (i<3){
            int data = distance[0];
            int m = 0;
            int n = 0;
            for (int j = 0; j <distance.length ; j++) {
                if (distance[j] < data && !Arrays.asList(flag).contains(distance[j])){
                    data = distance[j];
                    n = m;
                }
                 m ++;
            }
            flag[i] = data;
            retflag[i]  = n;
            i++;
        }
        for (int j = 0; j <retflag.length ; j++) {
            ret[j] = nums[retflag[j]];
        }
        return ret;
    }
}