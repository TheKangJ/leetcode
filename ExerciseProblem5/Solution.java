/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Solution
 * Author:   62701
 * Date:     2020/5/30 13:43
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package ExerciseProblem5;

import java.util.Stack;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 62701
 * @create 2020/5/30
 * @since 1.0.0
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class Solution {

    static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();
    public static void push(int node) {
        stack1.push(node);
    }

    public static int pop() {

        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        Integer pop = stack2.pop();
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return pop;
    }
}