package ExerciseProblem32;

/**
 * @author : 62701
 * @Title : Solution
 * @Description : 最长回文字符串
 * @date : 2020-09-11 13:04
 * @since : 1.0.0
 **/

//给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
//
// 示例 1：
//
// 输入: "babad"
//输出: "bab"
//注意: "aba" 也是一个有效答案。
//
//
// 示例 2：
//
// 输入: "cbbd"
//输出: "bb"
//
// Related Topics 字符串 动态规划
// 👍 2665 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public static void main(String[] args) {
        String longestPalindrome = longestPalindrome("babad");
        System.out.println(longestPalindrome);
    }

    public static String longestPalindrome(String s) {
        int length = s.length();
        if (length == 1) {
            return s;
        }
        if (length == 0) {
            return "";
        }
        //dp[i][j]表示从i到j是否是回文字符串，如果是，则dp[i][j]的值为长度，如果不是，则dp[i][j] = 0;
        int[][] dp = new int[length][length];

        int longestPalindromeLength = 0;
        int start = 0;

        // 转移方程，对dp[i][j]填空

        // 初始化dp[i][j]
        // 先把dp[i][j]对角线全部设置为1
        // i表示行，j表示列
        for (int i = 0; i < length; i++) {
            dp[i][i] = 1;
        }
        for (int j = 0; j < length; j++) {
            for (int i = 0; i <= j; i++) {
                // 假设s.charAt(j) == s.charAt(i)
                if (s.charAt(i) == s.charAt(j)) {
                    // 判断s.charAt(j)是否和s.charAt(i)是否相邻
                    if (j - i == 1) {
                        dp[i][j] = 2;
                    } else if (i == j) {
                        dp[i][j] = 1;
                    } else {
                        if (dp[i + 1][j - 1] > 0) {
                            dp[i][j] = dp[i + 1][j - 1] + 2;
                        } else {
                            dp[i][j] = 0;
                        }
                    }
                } else {
                    dp[i][j] = 0;
                }
                if (dp[i][j] > longestPalindromeLength) {
                    longestPalindromeLength = dp[i][j];
                    start = i;
                }
            }
        }
        return s.substring(start, start + longestPalindromeLength );
    }
}
//leetcode submit region end(Prohibit modification and deletion)

