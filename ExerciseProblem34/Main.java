package ExerciseProblem34;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author : 62701
 * @Title : Main
 * @Description :
 * @date : 2020-09-13 20:21
 * @since : 1.0.0
 * <p>
 * D星群岛由n个小岛组成。为了加强小岛居民之间的交流，头目决定启动一个造桥工程，将全部n个岛连接到一起。
 * <p>
 * 由于受到金融危机的影响，头目要求造桥的总成本要最少，并且还规定每一座桥的成本都不能超过k万D星币。
 * <p>
 * 需要注意的是，由于受到地理环境和气候影响，有些小岛之间没有办法直接造桥。
 * <p>
 * 现在给你m条小岛之间的造桥成本数据以及k的值，请问这个宏伟的造桥工程是否能够顺利完成？
 * <p>
 * 注意：可能边不够，也可能费用超支。
 * <p>
 * 多组输入，第1行输入一个正整数T表示输入数据的组数。
 * <p>
 * 对于每一组输入数据：输入m+1行。
 * <p>
 * 第1行包含三个正整数，分别表示n、m和k，n≤100，m≤1000，k≤10000，三个数字之间用空格隔开。
 * <p>
 * 接下来m行表示m条小岛之间的造桥成本数据，每一行包含三个正整数，分别表示两个小岛的编号（从1开始）和这两个小岛之间的造桥成本（单位：万）。
 * <p>
 * 2
 * 3 3 400
 * 1 2 200
 * 1 3 300
 * 2 3 500
 * 3 3 400
 * 1 2 500
 * 1 3 600
 * 2 3 700
 **/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int num1 = Integer.parseInt(s1);
        boolean flag = true;
        for (int i = 0; i < num1; i++) {
            String s = sc.nextLine();
            s = s.replace(" ","");
            int m = Integer.parseInt(s.substring(1, 2));
            int maxK = Integer.parseInt(s.substring(2, 3));
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < m; j++) {
                String str = sc.nextLine().replace(" ","");
                int k = Integer.parseInt(str.substring(2, 3));
                if (k <= maxK) {
                    set.add(Integer.parseInt(str.substring(0, 1)));
                    set.add(Integer.parseInt(str.substring(1, 2)));
                }
            }
            for (int j = 1; j < m + 1; j++) {
                if (!set.contains(j)){
                    flag = false;
                    break;
                };
            }
            if (flag){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
    }
}
