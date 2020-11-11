package ExerciseProblem56;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author : 62701
 * @Title : Solution
 * @Description :
 * @date : 2020-11-03 19:59
 * @since : 1.0.0
 * 1 2 3 4 5 6 7
 * 2 6
 * 3 4
 * 4 7
 **/

public class Solution {
    public static void main(String[] args) {
        System.out.println(Time());
    }

    public static int Time() {
        // 输入并存储
        Scanner sc = new Scanner(System.in);
        int TNumber = Integer.parseInt(sc.nextLine());
        String str1 = sc.nextLine();
        int numberOfSteep = Integer.parseInt(str1.substring(0, 1));
        int length = Integer.parseInt(str1.substring(2, 3));
        ArrayList<String> arrayList = new ArrayList<>(numberOfSteep);
        for (int i = 0; i < numberOfSteep; i++) {
            String str = sc.nextLine();
            arrayList.add(str);
        }

        // 计算
        int time = 0;
        int begin = 1;
        int speed = 1;
        for (int i = 0; i < arrayList.size(); i++) {
            String s = arrayList.get(i);
            int beginSteep = Integer.parseInt(s.substring(0,1));
            int endSteep = Integer.parseInt(s.substring(2,3));
            // 坡顶之前平地走的路程和时间
            time = time + (beginSteep - begin) / speed;
            // 坡走的时间
            speed = speed + i + 1;
            time = time + (endSteep - begin) / speed;
            begin = endSteep;
        }
        time = time + (length + 1 - begin) / speed;
        return time;
    }
}
