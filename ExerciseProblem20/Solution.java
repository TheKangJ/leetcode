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
package ExerciseProblem20;

import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 62701
 * @create 2020/5/30
 * @since 1.0.0
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int length = string.length();
        boolean[][] dp = new boolean[length][length];
        int left = 0;
        int right = 0;
        for (int i = length - 2; i >= 0; i--) {
            dp[i][i] = true;
            for (int j = i + 1; j < length; j++) {
                dp[i][j] = string.charAt(i) == string.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);
                if (dp[i][j] && right - left < j - i) {
                    left = i;
                    right = j;
                }
            }
        }
        System.out.println(right+1-left);
    }
}