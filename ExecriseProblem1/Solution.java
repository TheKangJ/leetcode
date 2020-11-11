/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Solution
 * Author:   62701
 * Date:     2020/5/28 22:41
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package ExecriseProblem1;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 62701
 * @create 2020/5/28
 * @since 1.0.0
 * <p>
 * 题目描述
 * 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数
 */
public class Solution {
    public static void main(String[] args) {
        int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int target = 11;
        System.out.println(Find(target,array));
    }

    public static boolean Find(int target, int[][] array) {
        if (array[0].length == 0){
            return false;
        }
        int row = array.length;   //总共有几行
        int column = array[0].length;   // 总共有几列
        int rowIndex = 0;
        if (target < array[0][0] || target > array[row - 1][column - 1]) {
            return false;
        }
        while (rowIndex < row){
            if (target >= array[rowIndex][0] && target <=array[rowIndex][column-1]){
                for (int number:array[rowIndex]
                     ) {
                    if (target == number){
                        return true;
                    }
                }
            }
            rowIndex++;
        }
        return false;
    }

}