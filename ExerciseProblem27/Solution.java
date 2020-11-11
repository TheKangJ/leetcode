package ExerciseProblem27;

import java.util.Arrays;

/**
 * @author : 62701
 * @Title : Solution
 * @Description :
 * @date : 2020-08-05 12:15
 * @since : 1.0.0
 * <p>
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 **/

public class Solution {

    public static String triCoding(int num) {
        if (num<0){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.reverse();
        while (num > 0) {
            sb.append(num % 3);
            num /= 3;
        }

        return  huoxingwen2(sb.reverse().toString());
    }
    public static String huoxingwen(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i <str.length() ; i++) {
            if (chars[i] == '0'){
                chars[i] = '@';
            }else if (chars[i] == '1'){
                chars[i] ='$';
            }else {
                chars[i] = '&';
            }
        }
        String newStr = Arrays.toString(chars).replaceAll("[\\[\\]\\s,]", "");
        return newStr;
    }
    public static String huoxingwen2(String str){
        String s1 = str.replace('0','@');
        String s2 = s1.replace('1','$');
        String s3 = s2.replace('2','&');
        return s3;
    }

    public static void main(String[] args) {
        String s = triCoding(123);
        System.out.println(s);
    }

}
