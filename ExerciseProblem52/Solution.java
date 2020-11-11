package ExerciseProblem52;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : 62701
 * @Title : Solution
 * @Description :
 * @date : 2020-10-19 15:54
 * @since : 1.0.0
 **/

public class Solution {
    public static void main(String[] args) {
        //int[] nums = new int[]{2,2,1,1,1,2,2};
        //System.out.println(majorityElement(nums));
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());
        System.out.println(queue.pop());;
        System.out.println(queue.empty());;
    }
    public static int majorityElement(int[] nums) {
        if (nums == null){
            return 0;
        }
        int length = nums.length;
        Map<Integer,Integer> map = new HashMap<>(length);
        for (int i = 0; i < length ; i++) {
            int key = nums[i];
            if (map.containsKey(key)){
                int value = map.get(key);
                value++;
                map.put(key,value);
            }else{
                map.put(key,1);
            }
        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()
             ) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value > length/2){
                return key;
            }
        }
        return 0;
    }
}
