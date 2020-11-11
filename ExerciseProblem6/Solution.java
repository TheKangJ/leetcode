/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Solution
 * Author:   62701
 * Date:     2020/5/30 15:22
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package ExerciseProblem6;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 62701
 * @create 2020/5/30
 * @since 1.0.0
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */

import java.util.ArrayList;

public class Solution {
    public int minNumberInRotateArray(int [] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <array.length-1 ; i++) {
            int temp = i+1;
            int i1 = array[i];
            int i2 = array[temp];
            if (i1 > i2){
                arrayList.add(i2);
            }
        }
        int temp = arrayList.get(0);
        for (int i = 1; i <arrayList.size() ; i++) {
            Integer integer = arrayList.get(i);
            if(temp > integer){
                temp = integer;
            }
        }
        return temp;
    }
}