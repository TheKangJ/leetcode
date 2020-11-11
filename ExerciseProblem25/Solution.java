package ExerciseProblem25;

import java.util.ArrayList;

/**
 * @author : 62701
 * @Title : Solution
 * @Description :
 * @date : 2020-08-03 15:25
 * @since : 1.0.0
 * <p>
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，
 * 那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}；
 * 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
 * {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}，
 * {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}，
 * {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 * 窗口大于数组长度的时候，返回空
 **/


public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 4, 2, 6, 2, 5, 1};
        System.out.println(maxInWindows(nums, 3));
    }

    public static ArrayList<Integer> maxInWindows(int[] num, int size) {
        if (size<=0 || size > num.length){
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> arrays = new ArrayList<>();
        ArrayList<Integer> temps = new ArrayList<>();
        for (int i = 0; i < num.length - size + 1; i++) {
            for (int j = i; j < i + size; j++) {
                temps.add(num[j]);
            }
            arrays.add(maxCheck(temps));
            temps.clear();
        }
        return arrays;
    }

    public static int maxCheck(ArrayList<Integer> arrays) {
        int temp = arrays.get(0);

        for (int i = 1; i < arrays.size(); i++) {
            if (arrays.get(i) > temp) {
                temp = arrays.get(i);
            }
        }
        return temp;
    }

}
