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
package ExerciseProblem16;

import java.util.Stack;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 62701
 * @create 2020/5/30
 * @since 1.0.0
 */
public class Solution {
    public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root2 == null || root1 == null  ){
            return false;
        }
        TreeNode index = root1;
        Stack<TreeNode> stack = new Stack<>();
        while (index.left!= null){
            stack.push(index);
            index  = index.left;

        }
        stack.push(index);
        return false;
    }
}