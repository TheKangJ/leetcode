/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Test
 * Author:   62701
 * Date:     2020/6/14 11:07
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package ExerciseProblem19;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 62701
 * @create 2020/6/14
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{33,44,61,2,36,42,56,81,11,17};
        Integer[] integers1 = Solution.find(integers);
        for (int i:integers1
             ) {
            System.out.println(i);
        }
    }
}