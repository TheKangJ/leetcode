package ExerciseProblem53;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author : 62701
 * @Title : Main2
 * @Description : 约瑟夫环
 * @date : 2020-10-24 20:40
 * @since : 1.0.0
 **/

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strings = str.split(",");
        int m = Integer.valueOf(strings[0]);
        int n = Integer.valueOf(strings[1]);
        yueSeFu(m, n);
    }

    public static void yueSeFu(int totalNum, int countNum) {
        List<Integer> start = new ArrayList<>();
        for (int i = 0; i < totalNum; i++) {
            start.add(i+1);
        }
        int k = 0;
        while (start.size() > 0) {
            k = k + countNum;
            k = k % (start.size()) - 1;
            if (k < 0) {
                System.out.println(start.get(start.size() - 1));
                start.remove(start.size() - 1);
                k = 0;
            } else {
                System.out.println(start.get(k));
                start.remove(k);
            }
        }
    }
}

