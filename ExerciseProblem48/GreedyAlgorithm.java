package ExerciseProblem48;

/**
 * @author : 62701
 * @Title : GreedyAlgorithm
 * @Description : 贪心算法
 * @date : 2020-10-09 15:27
 * @since : 1.0.0
 *
 * 假设1元、2元、5元、10元、20元、50元、100元的纸币，
 * 张数不限制，现在要用来支付K元，至少要多少张纸币？
 **/

public class GreedyAlgorithm {
    public static void main(String[] args) {
        greedyGiveMoney(67);
    }
    public static void greedyGiveMoney(int money){
        System.out.println("需要找零: " + money);
        int[] moneyLevel = new int[]{1, 5, 10, 20, 50, 100};
        for (int i = moneyLevel.length-1; i >=0 ; i--) {
            int num = money / moneyLevel[i];
            int mod = money % moneyLevel[i];
            money = mod;
            if (num > 0){
                System.out.println("需要" + num + "张" + moneyLevel[i] + "块的");
            }
        }
    }
}
