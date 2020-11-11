/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: minimumTotal
 * Author:   62701
 * Date:     2020/6/21 13:08
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package DynamicProgramming;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 62701
 * @create 2020/6/21
 * @since 1.0.0
 */
//给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
//
// 相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。
//
//
//
// 例如，给定三角形：
//
// [
//     [2],
//     [3,4],
//     [6,5,7],
//     [4,1,8,3]
//]
//
//
// 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
//
//
//
// 说明：
//
// 如果你可以只使用 O(n) 的额外空间（n 为三角形的总行数）来解决这个问题，那么你的算法会很加分。
// Related Topics 数组 动态规划
public class minimumTotal {
    public static int minimumTotal(List<List<Integer>> triangle){
        int length = triangle.size();
        if (length == 0){
            return 0;
        }else if (length ==1){
            return triangle.get(0).get(0);
        }else{
            Integer[][] memo = new Integer[length][length];
            for (int i = 0; i <length ; i++) {
                for (int j = 0; j <length ; j++) {
                    memo[i][j] = Integer.MAX_VALUE;
                }
            }
            int min = Integer.MAX_VALUE ;
            memo[0][0] = triangle.get(0).get(0);
            for (int i = 1; i <triangle.size() ; i++){
                for (int j = 0; j < triangle.get(i).size(); j++) {
                    if (j == 0){
                        memo[i][j] = memo[i-1][j] + triangle.get(i).get(j);
                    }else {
                        memo[i][j] = Math.min(memo[i - 1][j-1], memo[i - 1][j]) + triangle.get(i).get(j);
                    }
                }
                if (i == triangle.size()-1){
                    for (int j = 0; j <triangle.get(i).size() ; j++) {
                        min = Math.min(min,memo[i][j]);
                    }
                }
            }
            return min;
        }
    }
}