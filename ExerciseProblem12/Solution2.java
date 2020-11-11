/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Solution2
 * Author:   62701
 * Date:     2020/5/31 11:06
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
 * @create 2020/5/31
 * @since 1.0.0
 */
public class Solution2 {
    public static void reOrderArray(int [] array) {
        int length = array.length;
        int[] array1 = new int[length];
        int j = 0;
        for (int i = 0; i <length ; i++) {
            if (array[i] % 2 == 1){
                array1[j] = array[i];
                j++;
            }
        }
        for (int i = 0; i <array.length ; i++) {
            if (array[i] % 2 == 0){
                array1[j] = array[i];
                j++;
            }
        }
        System.arraycopy(array1,0,array,0,length);
    }


}