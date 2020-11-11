package ExerciseProblem38;

import java.util.Arrays;

/**
 * @author : 62701
 * @Title : Main
 * @Description :
 * @date : 2020-09-17 10:56
 * @since : 1.0.0
 **/

public class Main {
    public static void main(String[] args) {
        boolean[] flag = new boolean[3];
        Arrays.fill(flag,false);
        for (int i = 0; i < 3; i++) {
            if (flag[i]){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }
    }
}
