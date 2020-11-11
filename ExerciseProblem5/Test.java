/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Test
 * Author:   62701
 * Date:     2020/5/30 13:45
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
 */
public class Test {
    static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        System.out.println(pop());
        System.out.println(pop());
        push(100);
        System.out.println(pop());


    }

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