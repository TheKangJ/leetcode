package ExerciseProblem57;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : 62701
 * @Title : Solution
 * @Description :
 * @date : 2020-11-09 11:02
 * @since : 1.0.0
 *
 * //给定一个整数数组，判断是否存在重复元素。
 * //
 * // 如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 * //
 * //
 * //
 * // 示例 1:
 * //
 * // 输入: [1,2,3,1]
 * //输出: true
 * //
 * // 示例 2:
 * //
 * // 输入: [1,2,3,4]
 * //输出: false
 * //
 * // 示例 3:
 * //
 * // 输入: [1,1,1,3,3,4,3,2,4,2]
 * //输出: true
 * // Related Topics 数组 哈希表
 * // 👍 307 👎 0
 **/

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,1};
        int k = 3;
        //System.out.println(containsDuplicate(nums));
        System.out.println(containsNearbyDuplicate(nums,k));
    }
    public static boolean containsDuplicate(int[] nums) {
        int length = nums.length;
        Map<Integer,Integer> map = new HashMap<>(length);
        for (int i = 0; i < length; i++) {
            int key = nums[i];
            if (map.containsKey(key)){
                return true;
            }else{
                map.put(key,1);
            }
        }
        return false;
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int length = nums.length;
        Map<Integer,Integer> map = new HashMap<>(length);
        for (int i = 0; i < length; i++) {
            int key = nums[i];
            if (map.containsKey(key)){
                int value = map.get(key);
                if (Math.abs(i-value)<=k){
                    return true;
                }
                map.put(key,i);
            }else{
                map.put(key,i);
            }
        }
        return false;
    }

}
