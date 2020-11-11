package ExerciseProblem22;

import java.util.ArrayList;

/**
 * <h3>剑指offer</h3>
 * <p></p>
 *
 * @author : 你的名字
 * @date : 2020-07-12 20:09
 **/
public class Solution {
    public static String check(float[] input){
        int length = input.length;
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(0);
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Character> characters = new ArrayList<>();
        String  string = "0123456789abcdef";
        char[] chars = string.toCharArray();
        for (int i = 0; i < length ; i++) {
            if (input[i]>1){
                ints.add(i);
            }
        }
        for (int i = 0; i < ints.size()-1 ; i++) {
            int temp = ints.get(i+1) -ints.get(i);
            nums.add(temp);
        }
        System.out.println(nums);
        for (int i = 0; i <nums.size() ; i++) {
            characters.add(chars[nums.get(i)]);
        }
        String toString = characters.toString();
        return toString;
    }
}
