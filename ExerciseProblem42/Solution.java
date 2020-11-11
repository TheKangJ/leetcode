package ExerciseProblem42;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : 62701
 * @Title : Solution
 * @Description :
 * @date : 2020-09-25 16:44
 * @since : 1.0.0
 **/

public class Solution {
    public static void main(String[] args) {
    int[] nums = new int[]{1,2,3,2,3};
        System.out.println(uniqueAward(nums));
    }

   public static int uniqueAward(int[] nums){
        int length = nums.length;
        if (length == 0){
            return 0;
        }
       Map<Integer,Integer> map = new HashMap<>(length);
       for (int i = 0; i < length; i++) {
           if(map.containsKey(nums[i])){
               int frequency = map.get(nums[i]);
               map.put(nums[i],frequency+1);
           }else {
               map.put(nums[i],1);
           }
       }
       int specialAward = 0;
       for (Map.Entry<Integer,Integer> entry:map.entrySet()
            ) {
           if (entry.getValue() == 1){
               specialAward = entry.getKey();
           }
       }
       return specialAward;
   }
}
