/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Test
 * Author:   62701
 * Date:     2020/5/30 16:07
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package ExerciseProblem7;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 62701
 * @create 2020/5/30
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Fibonacci(10));
    }

    public static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int sum = 0;
        int one = 0;
        int two = 1;
        for (int i = 2; i < n + 1; i++) {
            sum = one +two;
            one = two;
            two = sum;
        }
        return sum;
    }
}
