/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Fib
 * Author:   62701
 * Date:     2020/6/21 9:14
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package DynamicProgramming;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 62701
 * @create 2020/6/21
 * @since 1.0.0
 */
public class Fib {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(Fib.fib(1000));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    public static int fib(int n){
        int[] f = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n ; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
}