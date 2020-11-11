package ExerciseProblem52;

import java.util.Random;

/**
 * @author : 62701
 * @Title : Main
 * @Description :
 * @date : 2020-10-22 14:00
 * @since : 1.0.0
 **/

public class Main {

    public static void main(String[] args) {
        // 生成不重复的26个字母
        String str = "abcdefghijklmnopqrstuvwxyz";
        int length = str.length();
        Random random = new Random();
        int[] nums = new int[length];
        char[] cc = str.toCharArray();
        int[] m = new int[length];
        StringBuffer sb = new StringBuffer();
        int ii = 0;
        while (sb.length()!=length){
            for (int i = 0; i < str.length(); i++) {
                ii = random.nextInt(26);
                m[i] = ii;
                if (sb.toString().indexOf(cc[ii]) == -1){
                    sb.append(cc[ii]);
                }
            }
        }
        System.out.println(sb.length());
        System.out.println(sb.toString());
    }
}
