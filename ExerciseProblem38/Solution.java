package ExerciseProblem38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : 62701
 * @Title : Solution
 * @Description :
 * @date : 2020-09-17 10:10
 * @since : 1.0.0
 **/
//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复
//的三元组。
//
// 注意：答案中不可以包含重复的三元组。
//
//
//
// 示例：
//
// 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//
//满足要求的三元组集合为：
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]
//
// Related Topics 数组 双指针

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        int size = 2;
        List<List<Integer>> lists = new ArrayList<>();
        if (length >= size) {
            Arrays.sort(nums);
            boolean[] flag = new boolean[length];
            Arrays.fill(flag,true);
            for (int i = 0; i < length; i++) {
                int indexNum = nums[i];
                int j = i + 1;
                int k = nums.length - 1;
                while (j < k) {
                    if (nums[j] + nums[k] == -indexNum && flag[i] && flag[j] && flag[k]) {
                        List<Integer> result = new ArrayList<>(3);
                        result.add(nums[i]);
                        flag[i] = false;
                        result.add(nums[j]);
                        flag[j] = false;
                        result.add(nums[k]);
                        flag[k] = false;
                        lists.add(result);
                        j++;
                        k--;
                    }

                }
                Arrays.fill(flag, true);
            }
        }
        return lists;

    }
}
