package DynamicProgramming;

/**
 * @author : 62701
 * @Title : CupRope
 * @Description :
 * @date : 2020-08-01 14:42
 * @since : 1.0.0
 * <p>
 * 给你一根长度为n的绳子，请把绳子剪成整数长的m段（m、n都是整数，n>1并且m>1，m<=n），
 * 每段绳子的长度记为k[1],...,k[m]。请问k[1]x...xk[m]可能的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18
 **/

public class CupRope {
    public static void main(String[] args) {
        System.out.println(cutRope(8));
    }

    public static int cutRope(int target) {
        int[] dp = new int[target + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        if (target > 3) {
            int maxTimes = 0;
            for (int i = 4; i <= target; i++) {
                for (int j = 1; j <= i / 2; j++) {
                    maxTimes = Math.max(dp[j] * dp[i - j], maxTimes);
                }
                dp[i] = maxTimes;
            }
        }

        return dp[target];
    }
}
