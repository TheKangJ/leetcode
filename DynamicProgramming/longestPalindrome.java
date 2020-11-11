/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: longestPalindrome
 * Author:   62701
 * Date:     2020/6/29 23:14
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
 * @create 2020/6/29
 * @since 1.0.0
 */
public class longestPalindrome {
    public static String longestPalindrome(String s) {
        int length = s.length();
        if (length < 1){
            return "";
        } else {
            String str;
            Boolean[][] dp = new Boolean[length][length];
            String string = "";
            for (int i = 0; i < length; i++) {
                dp[i][i] = true;
                for (int j = i ; j < length; j++)
                    if (s.charAt(i) != s.charAt(j)) {
                        dp[i][j] = false;
                    } else {
                        if (j - i < 3) {
                            dp[i][j] = true;
                        } else {
                            dp[i][j] = dp[i + 1][j - 1];
                        }
                        if (dp[i][j]) {
                            str = s.substring(i, j + 1);
                            if (string.length() < str.length()) {
                                string = str;
                            }
                        }
                    }
            }
            return string;
        }
    }
}