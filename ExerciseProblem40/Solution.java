package ExerciseProblem40;

/**
 * @author : 62701
 * @Title : Solution
 * @Description :
 * @date : 2020-09-22 19:28
 * @since : 1.0.0
 **/
//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
//
// 示例 1:
//
// 输入: 123
//输出: 321
//
//
// 示例 2:
//
// 输入: -123
//输出: -321
//
//
// 示例 3:
//
// 输入: 120
//输出: 21
//
//
// 注意:
//
// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。

public class Solution {
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

    public static int reverse(int x) {
        long num = 0;
        while (x != 0) {
            int last = x % 10;
            num = num * 10 + last;
            x = x / 10;
        }
        if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int)num;
        }
    }
}
