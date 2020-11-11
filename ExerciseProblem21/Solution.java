package ExerciseProblem21;

import java.util.Scanner;

/**
 * <h3>剑指offer</h3>
 * <p></p>
 *
 * @author : 你的名字
 * @date : 2020-07-12 19:08
 **/
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] robust = new int[n];
        int[] standard = new int[n];
        for (int i = 0; i < n; i++) {
            robust[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            standard[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (robust[j] < robust[j + 1]) {
                    int temp1 = robust[j];
                    robust[j] = robust[j + 1];
                    robust[j + 1] = temp1;

                    int temp2 = standard[j];
                    standard[j] = standard[j + 1];
                    standard[j + 1] = temp2;
                } else if (robust[j] == robust[j + 1]) {
                    if (standard[j] < standard[j + 1]) {
                        int temp2 = standard[j];
                        standard[j] = standard[j + 1];
                        standard[j + 1] = temp2;
                    }
                }
            }
        }
        for (int i = 0; i < n ; i++) {
            System.out.println(robust[i]+" "+standard[i]);
        }
    }
}
