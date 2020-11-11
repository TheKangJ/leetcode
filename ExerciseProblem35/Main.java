package ExerciseProblem35;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author : 62701
 * @Title : Solution
 * @Description :
 * @date : 2020-09-16 20:51
 * @since : 1.0.0
 **/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer index = sc.nextInt();
        int two = 0;
        int three = 0;
        int five = 0;
        ArrayList<Integer> ugly = new ArrayList<>();
        ugly.add(1);
        for (int i = 0; i < index - 1; i++) {
            while (true) {
                if (ugly.get(two) * 2 > ugly.get(ugly.size() - 1)) {
                    break;
                }
                two++;
            }
            while (true) {
                if (ugly.get(three) * 3 > ugly.get(ugly.size() - 1)) {
                    break;
                }
                three++;
            }
            while (true) {
                if (ugly.get(five) * 5 > ugly.get(ugly.size() - 1)) {
                    break;
                }
                five++;
            }
            int a = Math.min(ugly.get(two) * 2,ugly.get(three) * 3);
            int b = Math.min(a,ugly.get(five) * 5);
            ugly.add(b);
        }
        System.out.println(ugly.get(index-1));
    }
}
